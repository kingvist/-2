/**设计一个MyPoint类，表示一个具有x坐标和y坐标的点，该类包括：
		两个私有成员变量x和y表示坐标值；
		成员变量x和y的访问器和修改器
		无参构造方法创建点（0，0）；
		一个有参构造方法，根据参数指定坐标创建一个点；
		distance方法（static修饰）返回参数为MyPoint类型的两个点对象之间的距离。
                        编写主类Test，在主类中输入两点坐标，创建两个点对象，利用distance()方法计算这两个点之间的距离。
*/
package HomeWork6Day2_1;
class MyPoint{
    private double x;
    private double y;  //xy轴
    public MyPoint(){
        x = 0;
        y = 0;      //创建原点
    }
    public MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }                
    
    //访问器和修改器
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public static double distance(MyPoint n,MyPoint k) {     //创建方法传入n,k
        double x1 = n.getX();
        double x2 = k.getX();
        double y1 = n.getY();
        double y2 = k.getY();                    //将值赋值给x1x2y1y2;
        return  Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));  //利用公式计算
    }
        
    }
public class HomeWork6Day2_1 {
    public static void main(String[] args) {
        MyPoint num1 = new MyPoint(5,3);
        MyPoint num2 = new MyPoint(6,2); 
        System.out.println("两点的距离为:"+MyPoint.distance(num1, num2));//输出结果，将两个坐标传入distance方法

    }

}
