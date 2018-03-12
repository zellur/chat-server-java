import java.io.*;
import java.net.*;

public class DailyAdviceServer{

String[] adviceList = {"take smaller bites","so for the things you like to do","this aoba dnfkdnfk", "thus jdsfn djsfjds jdsfsj","this is rakib" };

public void go(){

try{
ServerSocket serverSock = new ServerSocket(4242);

while(true){
Socket sock = serverSock.accept();
PrintWriter writer = new PrintWriter(sock.getOutputStream());
String advice = getAdvice();
writer.println(advice);
writer.close();
System.out.println(advice);

}
}

catch(IOException c){c.printStackTrace(); }

}
private String getAdvice(){
int random = (int) (Math.random()* adviceList.length);
return adviceList[random];
}

public static void main(String[]args){
DailyAdviceServer a = new DailyAdviceServer();
a.go();
}
}
