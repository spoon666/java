package my.demo;

//public String getMessage()               返回此throwable的详细消息字符串
//public String toString()                      返回此可抛出的简短描述,简短描述用throw抛出
//public void printStaticTrace              把异常的错误信息输出在控制台

public class exception1 {

    int[] arr = {1, 2, 3};

    public void print1() throws ArrayIndexOutOfBoundsException {
            System.out.println(arr[3]);        //new ArrayIndexOutOfBoundsException()

    }

    public void print() {
        try {
            System.out.println(arr[3]);        //new ArrayIndexOutOfBoundsException()
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("你的程序出现了异常");
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

    public void teacher() {
        int core = 190;
        try{                                    // throws 处理的异常类不声明会报错
            if (core < 0 && core > 100) {
                throw new scoreException();
            }
        } catch (scoreException e) {
            System.out.println("teacher出现了异常");
        }

    }
}
