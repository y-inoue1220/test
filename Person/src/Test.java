
public class Test {
	public static void main(String[] args){
Person taro =new Person();
taro.name="山田太郎";
taro.age=20;
taro.phoneNumber="09011111111";
taro.address="iiiiiii@.co.jp";
taro.talk();
taro.walk();
taro.run();

System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.address);


Person jiro =new Person();
jiro.name="木村次郎";
jiro.age=18;
jiro.phoneNumber="090-1111-1111";
jiro.address="iiiiiii@.co.jp";

System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(jiro.phoneNumber);
System.out.println(jiro.address);



Person hanako =new Person();
hanako.name="鈴木花子";
hanako.age=16;
hanako.phoneNumber="090-1111-1111";
hanako.address="iiiiiii@.co.jp";

System.out.println(hanako.name);
System.out.println(hanako.age);
System.out.println(hanako.phoneNumber);
System.out.println(hanako.address);

Person yuto =new Person();
yuto.name="いのうえ";
yuto.age=29;
yuto.phoneNumber="090-1111-1111";
yuto.address="iiiiiii@.co.jp";

System.out.println(yuto.name);
System.out.println(yuto.age);
System.out.println(yuto.phoneNumber);
System.out.println(yuto.address);





Robot aibo=new Robot();
aibo.name="アイボ";
System.out.println(aibo.name);
aibo.talk();
aibo.walk();
aibo.run();


Robot asimo=new Robot();
asimo.name="アシモ";
System.out.println(asimo.name);
asimo.talk();
asimo.walk();
asimo.run();


Robot pepper=new Robot();
pepper.name="ペッパー";
System.out.println(pepper.name);
pepper.talk();
pepper.walk();
pepper.run();





	}
}