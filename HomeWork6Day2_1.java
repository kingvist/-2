/**���һ��MyPoint�࣬��ʾһ������x�����y����ĵ㣬���������
		����˽�г�Ա����x��y��ʾ����ֵ��
		��Ա����x��y�ķ��������޸���
		�޲ι��췽�������㣨0��0����
		һ���вι��췽�������ݲ���ָ�����괴��һ���㣻
		distance������static���Σ����ز���ΪMyPoint���͵����������֮��ľ��롣
                        ��д����Test���������������������꣬�����������������distance()����������������֮��ľ��롣
*/
package HomeWork6Day2_1;
class MyPoint{
    private double x;
    private double y;  //xy��
    public MyPoint(){
        x = 0;
        y = 0;      //����ԭ��
    }
    public MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }                
    
    //���������޸���
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
    public static double distance(MyPoint n,MyPoint k) {     //������������n,k
        double x1 = n.getX();
        double x2 = k.getX();
        double y1 = n.getY();
        double y2 = k.getY();                    //��ֵ��ֵ��x1x2y1y2;
        return  Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));  //���ù�ʽ����
    }
        
    }
public class HomeWork6Day2_1 {
    public static void main(String[] args) {
        MyPoint num1 = new MyPoint(5,3);
        MyPoint num2 = new MyPoint(6,2); 
        System.out.println("����ľ���Ϊ:"+MyPoint.distance(num1, num2));//�����������������괫��distance����

    }

}
