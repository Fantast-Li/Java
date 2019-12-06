package Study11_5;

import java.util.Arrays;

public class MyArray {
    int num[];
    int size;

    public MyArray() {
        num = new int[16];
    }

    public MyArray(int length) {
        this.num = new int[length];
    }

    /**
     * 向动态数组中添加元素，默认项数组末尾添加
     *
     * @param data {1,2,3,4}——>{1,2,3,4,5}
     */
    public void add(int data) {
        //如果当size=num.length  需要扩容
        if (size == num.length) {
            grow();
        }
        num[size] = data;
        size++;

    }

    /**
     * 向动态数组任意位置插入元素
     *
     * @param index 输入目标索引
     * @param data
     */

    public void add(int index, int data) {
        // 判断index是否合法
        if (rangrCheak(index))

            //   如果末尾插入元素 调用 add方法
            if (index == size) {
                add(data);
            }
            //  {1,2,3,4}->{1,2,5,3,4}  index=2
            else {
                //此时在中插入目标元素
                if (size == num.length) {
                    grow();
                }
                System.arraycopy(num, index, num, index + 1, size - index);
                num[index] = data;
                size++;
            }

    }

    /**
     * 在数组中中查找是否有指定data的元素，若有返回索引
     *
     * @param data
     * @return
     */
    public int find(int data) {
        for (int i = 0; i < size; i++) {
            if (num[i] == data) {
                System.out.println("找到元素！！");
                System.out.println("下标为：" + i);
                return i;
            }
        }
        System.out.println("元素不存在！");
        return -1;
    }

    /**
     * 在数组中查找是否有指定元素
     */
    public boolean contains(int data) {
        for (int i : num) {
            if (i == data) {
                System.out.println("找到元素！！");
                return true;
            }
        }
        System.out.println("未找到元素！！");
        return false;
    }


    /**
     * 删除第一个出现的目标元素
     *
     * @param data
     * @return
     */
    public boolean remove(int data) {
        for (int i = 0; i < size; i++) {
            if (num[i] == data) {
                //此时i就是要删除的下标
                //{1,2,3,4,4，9}->{1,2,3,4,9,9}->{1,2,3,4,9}
                System.arraycopy(num, i + 1, num, i, size - i - 1);
                num[size] = 0;
                size--;
                return true;


            }
        }
        return false;
    }

    /**
     * 获取指定位置元素
     *
     * @param index
     * @return
     */
    public int get(int index) {

        if (rangrCheak(index)) {
            return num[index];
        }
        return -1;
    }

    /**
     * 修改索引的内容
     *
     * @param index
     * @param data
     * @return
     */
    public boolean set(int index, int data) {
        if (rangrCheak(index)) {
            num[index] = data;
            return true;
        }
        return false;
    }

    //返回动态数组的长度
    public int size() {
        System.out.println("该数组的有效长度为"+size);
        return size;
    }

    /**
     * 清空动态数组->将数组的每个元素都改为0；
     */
    public void clear() {
        Arrays.fill(num, 0);
    }

    // 打印数组
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + "、");
        }
    }

    //内部数组扩容方法
    //此方法只有在本类使用，因此将其封装
    private void grow() {
        num = Arrays.copyOf(num, num.length << 1);

    }

    private boolean rangrCheak(int index) {
        if (index < 0 || index > size) {
            System.out.println("非法索引！");
            return false;
        }
        return true;
    }
}