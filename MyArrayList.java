import java.util.Arrays;

public class MyArrayList {
    public int[] elem ;
    public int useSize ;

    public MyArrayList() {
        this.elem = new int [10] ;
        this.useSize = 0 ;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,1);
        myArrayList.add(2,1);
        myArrayList.add(3,1);
        System.out.println(myArrayList.size());
    }

    /**
     * 打印顺序表
     */
    public void dispaly (){
        for (int i = 0; i < this.useSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
    }

    /**
     * 在pos 位置新加元素
     * @param pos
     * @param data
     */
    public void add (int pos ,int data){

        if (pos<0 || pos>useSize){
            System.out.println("pos 位置不合法");
        }else{
            for (int i = useSize-1; i>=pos  ; i--) {
                elem[i+1] = elem[i] ;
            }
            this.elem[pos]=data;
            this.useSize++;
        }
        //扩容
        if (this.useSize == this.elem.length){
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2) ;
        }


    }

    /**
     * 判定是否包含某个元素
     * @param toFind
     * @return
     */
    public boolean contains (int toFind){

        for (int i = 0; i < this.useSize ; i++) {
            if (this.elem[i] == toFind){
               return true;
            }
        }
        return false ;
    }

    /**
     * 查找某个元素对应的位置
     * @param toFind
     * @return
     */
    public int search (int toFind){
        for (int i = 0; i <this.useSize ; i++) {
            if (this.elem[i]==toFind){
                return i ;
            }
        }
        return -1;
    }

    /**
     * 获取pos位置的元素
     * @param pos
     * @return
     */
    public int getPos(int pos){
        if (pos<0||pos>=this.useSize){
            System.out.println("pos 位置错误");
            return  -1;
        }
        return this.elem[pos];
    }

    /**
     * 给pos的位置的元素设置为value
     * @param pos
     */
    public  void setPos(int pos,int value){
        if (pos<0||pos>=this.useSize){
            System.out.println("pos 位置错误");
            return ;
        }
        this.elem[pos] = value;
    }

    /**
     * 删除第一次出现的关键字key
     * @param toRemove
     */
    public void remove (int toRemove){
        int index = search(toRemove);
        if (index == -1){
            System.out.print("没有找到该元素");
        }
        for (int i = index; i < this.useSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.useSize--;
    }

    /**
     * 获取顺序表长度
     * @return
     */
    public int size(){

        return  this.useSize;
    }

    /**
     * 清空顺序表
     * 如果
     */
    public  void clear(){
        this.useSize = 0 ;
    }

}
