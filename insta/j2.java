public class j2
{
static void fun(int n){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(i+j>=n)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
return;
}
public static void main(String[] args) {
int n=21;
fun(n);
}
}