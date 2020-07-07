/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_application; //Define package in this program.
import java.util.Scanner;//import "Scanner" for input operations.
import javax.swing.JOptionPane;//import "JOptionPane" for basic of windows application.
import java.util.Random;//import "random" for  producing numbers. 
import java.io.File;//define input output application.
/**
 *Hi,I am Hasan.This packages have an aim which is "how to learn JAVA programing language".
 * I hope this exercises have  good effects for you.   
 * Have a nice working.
 * @author hasan
 */
public class Tutorial_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Every line have to finish with ";"
        // This is a comment line. If you add comment line.You should add "//".
        System.out.println("This area is a text section."); //we write "This area is text section." up the screen by-->  "System.out.println()"
        Scanner s= new Scanner(System.in);//I used scanner class because of fact that I take text variable by this program's users.
        //It may be  a green line up the s because we do not define it from the another line.
       
        

             //Type Of Variable
        //Java has a lot type of variable such as numeric,logical and textual.
        //Defining of variable is imp
      
        /*
       //Byte
       byte b=127;//This is byte variable which is called "b".Unless you define this type of variable -127 between +127.you would take a error which is about capacity of variable.
        System.out.println(b);//we print b as string variables in the screen.
      //--İnteger
        int a=10;//This is integer variable which is called "a".İf you define 3.4.This program just give "3".
        System.out.println(a);//we print a as string variables in the screen.
        //Long 
        long c=999999999;//This is long variable which is called "c".It have a big capacity for big integer variables.
        System.out.println(c); //we print c as string variables in the screen.
        //Double
        double d=3.14;//This is double variable which is called "d".If you define "d=4" in this type of variable.This program understand as "4.0".
        System.out.println(d); //we print d as string variables in the screen.       
        //Char
        char f='M';//This is char variable which is called "f".It just take a character.If you define more characters.you will take an eror.
        System.out.println(f); //we print f as string variables in the screen.
        //String 
        String g="Ali";//This is textual variable which is called "f".It has a big capacity as far as char variableç
        System.out.println(g); //we print g as string variables in the screen.
        //Bool
        boolean and=true;//This is a variable of mathematic operation.If you have a project which is about discrete mathematic or lineer algebra.I think you should use this type of variable for your project. 
        System.out.println(and);//We write and as string variable in the screen.
        Integer h=new Integer(29);//I define a variable as type of referance.
        System.out.println(h);//we print h as string variable in the screen.
        int [] arrayys={0b110,0b01110,0b100110};
        for(int x=0;x<arrayys.length;x++) //This is type of loop which is called "for".It have three sections.First section define a variable for after section.We stipulate for the loop's logic.Finally,we make a mathematical operation on the defining value of variable.
        {
        System.out.println(arrayys[x]);//We changed this array personnel as integer values.After that,I write these as string valuable in the secreen.
        }
        //Application-1
        //Please define four numbers as string values.After that,you convert this values as integer.You define a variable which is called "sum".All values sum op in the sum.
         
        //I define four variable as string values.
         String val1="1";
         String val2="2";
         String val3="3";
         String val4="4";
         
         //I convert to this values.I define these as integer variable.
         int number1=Integer.valueOf(val1);
         int number2=Integer.valueOf(val2);
         int number3=Integer.valueOf(val3);
         int number4=Integer.valueOf(val4);
         
         //I sum up all variable in "sum".
         int sum=number1+number2+number3+number4;
         
         
         System.out.println(sum);//We print "sum" as  a string value in the screen.
         
         //Type Of Operations
         //I define three variable typ of integer by "="."=" is an operation.
         int first=5;
         int second=6;
         int third=7;
         int tbg = 0;
         //"İf()" is an comparison operator.I can query wihich number more biger or smaller ? 
         if(first>second && first>third)  {
         tbg=first;
         }
         else if(second>first &&second>third) {
         
         tbg=second;
         }
         else if(third>second && third>first) {
         
        tbg=third;
         }
        System.out.println(tbg);//I print the biggest number as string values in the screen.
        //Mathematic operation 
        //We have five operations which is +(addition),-(subtraction),/(divide by),*(multiplication) and %(mod)
        
      //Application-2
      
      //Please define five value in an integer array.Write and  calculate odd or even number. 
      //Rules = if Numbers%2=0 .Number is even. 
         int [] asd = {92,93,94,95,96}; //define five integer number in this array.
        for(int r=0;r<asd.length;r++) //It is a loop for calculating odd or  even number.
        {
        if(asd[r]%2==0) //It is type of loop which have an aim.It takes mod array's number.
        {
            System.out.println(asd[r]+"is odd");//Print (asd[r]+"is odd") in the screen.
        }
        else         {
            System.out.println(asd[r]+"is even"); //Print asd[r]+"is even" in the screen.
        }
        
        
        
        
        
                                           }
        
        //Loops
        //We usually use loops(for,while,do while,if else) for repetitive operations such as calculating factorial.
        
        //Application-3
        //Enter number calculate factorial amount.
        
         
        int amount=1;
        System.out.println("Please enter an integer number for factorial amount:");
      int  numberss=s.nextInt();
        for(int l=1;l<numberss+1;l++) {
        
        amount=amount*l;
        }
        System.out.println(amount+" is factorial amount");
        
        
        //Application-4
        //Please calculate  loop which is drawing triangle with "*" 
        /*
        Like this up triangle
        *
        **
        ***
        ****
        *****
        
        */
        /*
        System.out.println("Please enter an integer number for drawing triangle:");//I wanted an integer value for drawing triangle.
        int number22=s.nextInt(); //I define integer value in "number22".
        
        //I define 2D loop because I have to limit as row and coulmn 
        for(int n=0;n<number22;n++) 
       {
        for(int n2=0;n2<=n;n2++) {
        
        System.out.print("*");
        }
        System.out.print("\n"); //I pass new line by (\n);
        }
        */
        
       //Method
       //Method have some properties which control some structure of irregular codes.
       //Let's give an example.
       
       //Application-5
       //Please calculate and print five mod is zero  between entering two number
       /*
       System.out.println("Please enter first(small then second number):");
       int a=s.nextInt();
        System.out.println("Please enter second number:");
       int b=s.nextInt();
       appfive(a,b);
       */
       


      //Application-6
      //Please calculate factorial number with recursive function.
      //factorial number rule:n!=(1*2*3*...*(n-1)*n).
      //recursive function:If you have an infinity equations or mathematic battologize operation.You should use recursive functions.
      //System.out.println("Please enter an integer number(ex:1,2,3):");//I want to integer number from the user.
      //int nuMber=s.nextInt();//I define integer number in the variable of "nuMber"
      //System.out.println(appsix(nuMber)+" is solution");//I add "nuMber" from the appsix (recursive function.)
       
      
      //Arrays
      
      //Arrays have got some properties which are cluster operation,lineer algebra for 2D arrays and communication of classes.
     
      
      //Application-7
      //Please enter the four values in the array.All values addition first value,multiplication second value,,addition all odd number third value,addition all even number last value in the new array.
      /*
      int [] first_array=new int [4];//I define first array because of fact that I take input value for mathmematic operation.
      int []last_array=new int[4];//I define solution's array.
      //This variable have some aims which was defined for array's calculating operations.
      int multip=1;
      int total=0;
      int eventotal=0;
      int oddtotal=0;
      int convnumber;
      
      //This loop take values for first array.After that,ıt calculates by some operations for second array. 
      for(int o=0;o<4;o++) {
         System.out.println("Please enter integer value for first array:");
         convnumber=s.nextInt();
         first_array[o]=convnumber;
         multip=multip*first_array[o];
         
         total=total+first_array[o];
         if(first_array[o]%2==0) {
         eventotal=eventotal+first_array[o];
         }
         else {
         oddtotal=oddtotal+first_array[o];
         }
         
      last_array[0]=multip;
      last_array[1]=total;
      last_array[2]=eventotal;
      last_array[3]=oddtotal;
      }
      
      //This loop print second array in the screen.
      for(int w=0;w<4;w++) {
      System.out.println(last_array[w]);
      
      }
      */
      
      
      /*
      //Application-8
      //Please enter two 3x3 different integer number matrix.After that,calculate multiplication two matrixs.
      int [][]firstmatrix=new int [3][3];//I define first matrix by 2d arrays.
      int [][]secondmatrix=new int [3][3];//I define second matrix by 2d arrays.
      int [][]solutionmatrix=new int [3][3]; //I define solutions matrix by 2d arrays.
      int firstinput;
      int secinput;
     //I take value of first matrix by user.
      for(int a=0;a<4;a++) {
      for(int b=0;b<4;b++){
      System.out.println("Please enter first matrix value:");
      firstinput=s.nextInt();
      firstmatrix[a][b]=firstinput;
      }
      }
       //I take value of second matrix by user.
       for(int c=0;c<4;c++) {
      for(int d=0;d<4;d++){
      System.out.println("Please enter second matrix value:");
      secinput=s.nextInt();
      firstmatrix[c][d]=secinput;
      }
      }
       

          //This loops calculate multiplication two matrixs.
       for(int e=0;e<4;e++) {
      for(int f=0;f<4;f++){
           for(int g=0;g<4;g++) {
           
           
          solutionmatrix[e][f]=firstmatrix[e][g]*secondmatrix[g][f];
           }
      
      }
      }
       //I print solution matrix in the screen.
       for(int v=0;v<4;v++) {
      for(int z=0;z<4;z++){
      System.out.print(solutionmatrix[v][z]);  
      }
      System.out.print("\n");
      }
       */
      
      //SCANNER and JOPTİONPANE 
      //Scanner was used  taking input operation for entering values by users.
      //Let's give  examples about its.
      
      
      /*
      //Application-9
      //Enter midterm and final notes by users.After that,calculate general academic notes.
      //General Academic Note Rule:(midtermnote%40)+(finalnote%60)
      int midtermexam,finalexam;//I define variables for midterm and final notes.
      float gano; //I define general academic notes as variable type of float because of facat that general Academic Note Rule is (midtermnote%40)+(finalnote%60)
      System.out.println("Please enter your midterm notes:");//I post massage which is "entering midterm notes:"
      midtermexam=s.nextInt();//I take midterm note 
      System.out.println("Please enter your final notes:");//I post massage which is "entering final notes:"
      finalexam=s.nextInt();//I take final note 
       gano=((finalexam*6)/10+((midtermexam*4)/10));//Calculate general academic note.
     if(gano>50)//İf "gano" is biger than 50."*" is line run.But it is smaller than 50."**" is line run. 
     {
     System.out.println("Congratulations,you are passed :) ");//*
     }
     else {
     System.out.println("Sorry,you are failed");//**
     
     }
      */
      //Application-10
      //It is a number guessing game.
      /*
      int i=1;
      Random r=new Random();//Define random as class in  "r" 
      int number=r.nextInt(10);//define 0-10 random integer number in "number"
      while(true) //İnfinity Loop for user finding estimation number.
      {
      String estimation=JOptionPane.showInputDialog("Please enter your estimation number:");//It is an input dialog which take value as string from user.
      int t=Integer.parseInt(estimation);//"estimation" convert as integer values in "t".
      if(t==number)
      {
      String message="It is right.Estimation score:"+i;
      JOptionPane.showMessageDialog(null,message,"SOLUTION",JOptionPane.INFORMATION_MESSAGE);//It is a message dialog structure of code. Second section:variable third section:Dialog's title fourth section:dialog's icon.
      }
      else 
      {
      i++;//Unless you find estimation score.This line additions it.
      }
      }
      */
      
      //Application-11
      /*
      //Define a class which is called "worker".Add some properties of variable in this class.After that,enter the value for worker information by user.Finally,print worker's information in the screen by "worker".
      worker dworkr = new worker ();//add worker's properties "dworkr". 
      System.out.println("Please enter staff id:");
      dworkr.wid=s.nextInt();//"dworkr.wid" is added staff id by user.
      System.out.print("Please enter staff name:");
      dworkr.wnname=s.next();//"dworkr.wnname" is added staff name by user.
      System.out.print("Please enter staff department:");
      dworkr.wdepartment=s.next();//"dworkr.wdepartment" is added staff department by user.
      System.out.print("Please enter staff title:");
      dworkr.wtitle=s.next();//"dworkr.wtitle" is added staff title by user.
      
      //This sections print messages using worker's properties in the screen.
      System.out.println("Hi Dear,"+dworkr.wnname);
      System.out.println(dworkr.wid+" is your business id.");
      System.out.println(dworkr.wdepartment+" is your department.");
      System.out.println(dworkr.wtitle+" is your title.");
      
      */
      
      /*
      //Application-12
      //f(x)= if x>6 calculate (x^4+x^sinx+sqrt(x))
      // if x<6 calculate (logx+secx) --->secx=(1/cosx)
      //Please write a code which calculate this equation.
      //Math.pov(x,2)-->calculate (x^2)=x*x.
      //Math.sqrt(x,a)-->calculate sqrt degree a of x.
      //Math.sin(x)--->calculate sinx.
      //Math.cos(x)--->calculate cosx.
      //Math.log(x)--->calculate logx.
      
      System.out.println("Please enter integer number:");
      int nmb=s.nextInt();//Take a value by user in "nmb".
      double solt;//solutions variable.
      
      if(nmb>6) //if nmb is biger than six.First equation will run. 
      {
      solt=Math.pow(nmb,4)+Math.sqrt(nmb)+(Math.pow(nmb,Math.sin(nmb)));
      
      System.out.println(solt);
     
      }
      else //unless nmb is biger than six.Second equation will run.
      {
     solt=Math.log(nmb)+(1/(Math.cos(nmb)));
     System.out.println(solt);
      }
     */
      
      /*
      //Application-13
      //Upper String Operations. 
      String part6 = "Letters application.";
      System.out.println(part6.toUpperCase()); // print "LETERS APPLİCATİON " by "toUpperCase()"
      System.out.println(part6.toLowerCase()); // print "letters application" by "toLowerCase()"
      System.out.println(part6.length());//Length was finded by method of ".length()".
      String part1="Part Of";
      String part2="Text";
      System.out.println(part1+part2);//print "Part OfText".
      System.out.println(part1.concat(part2));//print "Part OfText" by ".concat()".
      String part3="ANKARA";
      String part4="Ankara";
      System.out.println(part3.equals(part4)); //If part3=part4 such as (A=A).Solution is true.It give a value which is  type of boolen.
      System.out.println(part3.equalsIgnoreCase(part4));//If part3=part4 such as(A=a or a=A).Solution is true.It give a value which is  type of boolen.
      System.out.println("Please enter a word:");//I want a word by user.   
      String part5=s.nextLine();//take a value in "part5" by users.
      boolean sltn=part5.regionMatches(0, part4, 0,part5.length());//".regionMatches();" is  method of finding text."part4" is resource variable.Zeros are subscripts of variables.      
      if(sltn==true) 
      {
      System.out.println("congratulations,you finded word in the full sentence");//if "sltn" is true.This section run..
      }
      else 
      {
          System.out.println("Sorry,you did not find word in the full screen.");//unless "sltn" is true.This section run..
      }
      */
      
      
    }
   static void appfive(int c,int d) {
    for(int f=c;f<d;f++) {
    if(f%5==0) {
    System.out.println(f);
    
    }
    
    
    }
    
    
    }
    static int appsix (int w) {
      
    if(w==0){
    return 1;
    }
    else {
    return(w*appsix(w-1));
    }
    }
    public static class worker //Define class which is called "worker".Add some having properties of variable for Application-11. 
    {
    long wid;
    String wnname;
    String wdepartment;
    String wtitle;
    
    
    }
}
