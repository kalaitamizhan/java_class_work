import java.util.Scanner;
class Swiggy
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
		System.out.println("\t\t\t\tWelcome To Swiggy");
		System.out.println("\t\t\t\t..........................");
		System.out.println("Getting you into the Hotels......");
	    Thread.sleep(2000);
		System.out.println("Hotel Names");
		System.out.println(".............");
	System.out.println("1.Taj\n2.A2B\n3.Amma Canteen");
	System.out.print("\nSelect the Hotel:");
	int hotel_name=sc.nextInt();
	System.out.println("Getting you into the Hotel......");
	Thread.sleep(2000);
	switch (hotel_name)
	{
	case 1:{System.out.println("\t\t\t\tWelcome to Taj");
	        System.out.println("\t\t\t\t.......................");
			System.out.println("Today Menu");
			System.out.println("............");
	        System.out.println("1.Mutton Biryani\n2.chikan Biryani\n3.prawn Biryani");
			System.out.print("\nSelect your Food:");
			int food=sc.nextInt();
			System.out.println("Server Busy......");
	        Thread.sleep(2000);
			if (food==1)
			{ 
				System.out.println("\nMutton Biryani price is 450Rupees");
				System.out.print("\nEnter your Quantity:");
				int Quantity=sc.nextInt();
				System.out.println("Processing.......");
	            Thread.sleep(2000);
				int mutt_bir =450;
			    double bill= mutt_bir* Quantity;
				System.out.println("\nYour bill Amount is:"+bill);
				System.out.print("\n\nEnter any key to confirm the order or press N to cancel the order:");
				char key=sc.next().charAt(0);
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (key!='N' && key!='n')
				{
				 System.out.println("\t\t\tYour Order is confirm And go to Payment Method !");
				 System.out.println("\t\t\t...................................................");
			     System.out.println("\n..Payment Method..");
			     System.out.println(".....................");
			      System.out.println("\n1.Gpay\n2.Phonepay");
			      System.out.print("\nSelect your payment method:");
			      int Payment=sc.nextInt();
			      System.out.println("Busy Server......");
	              Thread.sleep(2000);
			if (Payment==1)
			{   System.out.println("\nGpay");
				System.out.println("..........");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Bank Server Busy......");
	            Thread.sleep(2000);
			if (user_bill==bill)
			{
				//Gpay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry you order faild");
			
			}
			else
				if(Payment==2)
				{
				System.out.println("\nPhonepay");
				System.out.println("..........");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (user_bill==bill)
			{
				//Phonepay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			}else
				System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry your order is cancel");
			
			}
			
//..............................................................................
			
			
			else if (food==2)
				{
					System.out.println("\nChikan Biryani price is 250 Rupees");
					System.out.print("\nEnter your Quantity:");
				    int Quantity=sc.nextInt();
				    System.out.println("Getting you into the Food Menu.......");
	                Thread.sleep(2000);
					int ch_bir=250;
			        double bill=ch_bir*Quantity;
				    System.out.println("\nYour bill Amount is:"+bill);
				    System.out.print("\n\nEnter any key to confirm the order or press N to cancel the order:");
				    char key=sc.next().charAt(0);
				    System.out.println("Processing......");
	                Thread.sleep(2000);
					if (key!='N' && key!='n')
				{
				 System.out.println("\t\t\tYour Order is confirm And go to Payment Method !");
				 System.out.println("\t\t\t...................................................");
			     System.out.println("\n..Payment Method..");
			     System.out.println(".....................");
			      System.out.println("\n1.Gpay\n2.Phonepay");
			      System.out.print("\nSelect your payment method:");
			      int Payment=sc.nextInt();
			      System.out.println("Processing......");
	              Thread.sleep(2000);
				  if (Payment==1)
			{   System.out.println("\nGpay");
				System.out.println("..........");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
			if (user_bill==bill)
			{
				//Gpay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
				}
				else
				    System.out.println("\t\t\tSorry you order faild");
				}
				else
					if(Payment==2)
				{
				System.out.println("\nPhonepay");
				System.out.println("..........");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (user_bill==bill)
			{
				//Phonepay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry you order faild");
			}
			else
				System.out.println("\t\t\tSorry your order is cancel");
				
				}
			else
				System.out.println("\t\t\tSorry your order is faild");
				
				}
//...........................................................................................
				else if (food==3)
				{
					System.out.println("\nPrawn Biryani price is 150 Rupees");
					System.out.print("\nEnter your Quantity:");
				    int Quantity=sc.nextInt();
				    System.out.println("Getting you into the FOod Menu.......");
	                Thread.sleep(2000);
					int pr_bir=150;
			        double bill=pr_bir*Quantity;
				    System.out.println("\nYour bill Amount is:"+bill);
				    System.out.print("\n\nEnter any key to confirm the order or press N to cancel the order:");
				    char key=sc.next().charAt(0);
				    System.out.println("Processing......");
	                Thread.sleep(2000);
					if (key!='N' && key!='n')
						{
				     System.out.println("\t\t\tYour Order is confirm And go to Payment Method !");
				 System.out.println("\t\t\t...................................................");
			     System.out.println("\n..Payment Method..");
			     System.out.println(".....................");
			      System.out.println("\n1.Gpay\n2.Phonepay");
			      System.out.print("\nSelect your payment method:");
			      int Payment=sc.nextInt();
			      System.out.println("Processing......");
	              Thread.sleep(2000);
				    if (Payment==1)
			{   System.out.println("\nGpay");
				System.out.println("..........");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
			if (user_bill==bill)
			{
				//Gpay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry you order faild");
			}
			else
					if(Payment==2)
				{
				System.out.println("\nPhonepay");
				System.out.println("..........");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (user_bill==bill)
			{
				//Phonepay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you!__Your order is conform!");
					
				else
					System.out.println("\t\t\tSorry your order is faild");
			}
			else
				System.out.println("\t\t\tSorry your order is Cancel");
			
				}
				else
				   System.out.println("\t\t\tSorry your order is Cancel");
			}
			else
				System.out.println("\t\t\tSorry your order is Cancel");
			}
			break;
		    }
//.........................................................................................			
	case 2:{
		    System.out.println("\t\t\t\tWelcome to A2B");
	        System.out.println("\t\t\t\t.......................");
			System.out.println("Today Menu");
			System.out.println("............");
	        System.out.println("1.Meals\n2.Sambar rice\n3.Curd rice");
			System.out.print("\nSelect your Food:");
			int food=sc.nextInt();
			System.out.println("Getting you into the Food Menu......");
	        Thread.sleep(2000);
			if (food==1)
			{ 
				System.out.println("\nMeals price is 250Rupees");
				System.out.print("\nEnter your Quantity:");
				int Quantity=sc.nextInt();
				System.out.println("Getting you into the Hotel.......");
	            Thread.sleep(2000);
				int mutt_bir =250;
			    double bill= mutt_bir* Quantity;
				System.out.println("\nYour bill Amount is:"+bill);
				System.out.print("\n\nEnter any key to confirm the order or press N to cancel the order:");
				char key=sc.next().charAt(0);
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (key!='N' && key!='n')
				{
				 System.out.println("\t\t\tYour Order is confirm And go to Payment Method !");
				 System.out.println("\t\t\t...................................................");
			     System.out.println("\n..Payment Method..");
			     System.out.println(".....................");
			      System.out.println("\n1.Gpay\n2.Phonepay");
			      System.out.print("\nSelect your payment method:");
			      int Payment=sc.nextInt();
			      System.out.println("Processing......");
	              Thread.sleep(2000);
			if (Payment==1)
			{   System.out.println("\nGpay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
			if (user_bill==bill)
			{
				//Gpay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry you order faild");
			
			}
			else
				if(Payment==2)
				{
				System.out.println("\nPhonepay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (user_bill==bill)
			{
				//Phonepay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			}else
				System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry your order is cancel");
			
			}
			
//..............................................................................
			
			
			else if (food==2)
				{
					System.out.println("\nSambar rice price is 150 Rupees");
					System.out.print("\nEnter your Quantity:");
				    int Quantity=sc.nextInt();
				    System.out.println("Getting you into the Hotel.......");
	                Thread.sleep(2000);
					int ch_bir=150;
			        double bill=ch_bir*Quantity;
				    System.out.println("\nYour bill Amount is:"+bill);
				    System.out.print("\n\nEnter any key to confirm the order or press N to cancel the order:");
				    char key=sc.next().charAt(0);
				    System.out.println("Processing......");
	                Thread.sleep(2000);
					if (key!='N' && key!='n')
				{
				 System.out.println("\t\t\tYour Order is confirm And go to Payment Method !");
				 System.out.println("\t\t\t...................................................");
			     System.out.println("\n..Payment Method..");
			     System.out.println(".....................");
			      System.out.println("\n1.Gpay\n2.Phonepay");
			      System.out.print("\nSelect your payment method:");
			      int Payment=sc.nextInt();
			      System.out.println("Processing......");
	              Thread.sleep(2000);
				  
				  if (Payment==1)
			{   System.out.println("\nGpay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
			if (user_bill==bill)
			{
				//Gpay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
				}
				else
				    System.out.println("\t\t\tSorry you order faild");
				}
				else
					if(Payment==2)
				{
				System.out.println("\nPhonepay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (user_bill==bill)
			{
				//Phonepay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry you order faild");
			}
			else
				System.out.println("\t\t\tSorry your order is cancel");
				
				}
			else
				System.out.println("\t\t\tSorry your order is faild");
				
				}
//...........................................................................................
				else if (food==3)
				{
					System.out.println("\nCurd rice price is 100 Rupees");
					System.out.print("\nEnter your Quantity:");
				    int Quantity=sc.nextInt();
				    System.out.println("Getting you into the Hotel.......");
	                Thread.sleep(2000);
					int pr_bir=100;
			        double bill=pr_bir*Quantity;
				    System.out.println("\nYour bill Amount is:"+bill);
				    System.out.print("\n\nEnter any key to confirm the order or press N to cancel the order:");
				    char key=sc.next().charAt(0);
				    System.out.println("Processing......");
	                Thread.sleep(2000);
					if (key!='N' && key!='n')
						{
				     System.out.println("\t\t\tYour Order is confirm And go to Payment Method !");
				 System.out.println("\t\t\t...................................................");
			     System.out.println("\n..Payment Method..");
			     System.out.println(".....................");
			      System.out.println("\n1.Gpay\n2.Phonepay");
			      System.out.print("\nSelect your payment method:");
			      int Payment=sc.nextInt();
			      System.out.println("Processing......");
	              Thread.sleep(2000);
				    if (Payment==1)
			{   System.out.println("\nGpay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
			if (user_bill==bill)
			{
				//Gpay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry you order faild");
			}
			else
					if(Payment==2)
				{
				System.out.println("\nPhonepay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (user_bill==bill)
			{
				//Phonepay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you!__Your order is conform!");
					
				else
					System.out.println("\t\t\tSorry your order is faild");
			}
			else
				System.out.println("\t\t\tSorry your order is Cancel");
			
				}
				else
				   System.out.println("\t\t\tSorry your order is Cancel");
			}
			else
				System.out.println("\t\t\tSorry your order is Cancel");
			}
		break;}
		
	case 3:{System.out.println("\t\t\t\tWelcome to Amma Canteen");
	        System.out.println("\t\t\t\t.......................");
			System.out.println("Today Menu");
			System.out.println("............");
	        System.out.println("1.Meals\n2.Sambar rice\n3.Curd rice");
			System.out.print("\nSelect your Food:");
			int food=sc.nextInt();
			System.out.println("Getting you into the Hotel......");
	        Thread.sleep(2000);
			if (food==1)
			{ 
				System.out.println("\nMeals price is 50Rupees");
				System.out.print("\nEnter your Quantity:");
				int Quantity=sc.nextInt();
				System.out.println("Getting you into the Hotel.......");
	            Thread.sleep(2000);
				int mutt_bir =50;
			    double bill= mutt_bir* Quantity;
				System.out.println("\nYour bill Amount is:"+bill);
				System.out.print("\n\nEnter any key to confirm the order or press N to cancel the order:");
				char key=sc.next().charAt(0);
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (key!='N' && key!='n')
				{
				 System.out.println("\t\t\tYour Order is confirm And go to Payment Method !");
				 System.out.println("\t\t\t...................................................");
			     System.out.println("\n..Payment Method..");
			     System.out.println(".....................");
			      System.out.println("\n1.Gpay\n2.Phonepay");
			      System.out.print("\nSelect your payment method:");
			      int Payment=sc.nextInt();
			      System.out.println("Processing......");
	              Thread.sleep(2000);
			if (Payment==1)
			{   System.out.println("\nGpay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
			if (user_bill==bill)
			{
				//Gpay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry you order faild");
			
			}
			else
				if(Payment==2)
				{
				System.out.println("\nPhonepay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (user_bill==bill)
			{
				//Phonepay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			}else
				System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry your order is cancel");
			
			}
			
//..............................................................................
			
			
			else if (food==2)
				{
					System.out.println("\nSambar rice price is 20 Rupees");
					System.out.print("\nEnter your Quantity:");
				    int Quantity=sc.nextInt();
				    System.out.println("Getting you into the Hotel.......");
	                Thread.sleep(2000);
					int ch_bir=20;
			        double bill=ch_bir*Quantity;
				    System.out.println("\nYour bill Amount is:"+bill);
				    System.out.print("\n\nEnter any key to confirm the order or press N to cancel the order:");
				    char key=sc.next().charAt(0);
				    System.out.println("Processing......");
	                Thread.sleep(2000);
					if (key!='N' && key!='n')
				{
				 System.out.println("\t\t\tYour Order is confirm And go to Payment Method !");
				 System.out.println("\t\t\t...................................................");
			     System.out.println("\n..Payment Method..");
			     System.out.println(".....................");
			      System.out.println("\n1.Gpay\n2.Phonepay");
			      System.out.print("\nSelect your payment method:");
			      int Payment=sc.nextInt();
			      System.out.println("Processing......");
	              Thread.sleep(2000);
				  
				  if (Payment==1)
			{   System.out.println("\nGpay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
			if (user_bill==bill)
			{
				//Gpay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
				}
				else
				    System.out.println("\t\t\tSorry you order faild");
				}
				else
					if(Payment==2)
				{
				System.out.println("\nPhonepay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (user_bill==bill)
			{
				//Phonepay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry you order faild");
			}
			else
				System.out.println("\t\t\tSorry your order is cancel");
				
				}
			else
				System.out.println("\t\t\tSorry your order is faild");
				
				}
//...........................................................................................
				else if (food==3)
				{
					System.out.println("\nCurd rice price is 15 Rupees");
					System.out.print("\nEnter your Quantity:");
				    int Quantity=sc.nextInt();
				    System.out.println("Getting you into the Hotel.......");
	                Thread.sleep(2000);
					int pr_bir=15;
			        double bill=pr_bir*Quantity;
				    System.out.println("\nYour bill Amount is:"+bill);
				    System.out.print("\n\nEnter any key to confirm the order or press N to cancel the order:");
				    char key=sc.next().charAt(0);
				    System.out.println("Processing......");
	                Thread.sleep(2000);
					if (key!='N' && key!='n')
						{
				     System.out.println("\t\t\tYour Order is confirm And go to Payment Method !");
				 System.out.println("\t\t\t...................................................");
			     System.out.println("\n..Payment Method..");
			     System.out.println(".....................");
			      System.out.println("\n1.Gpay\n2.Phonepay");
			      System.out.print("\nSelect your payment method:");
			      int Payment=sc.nextInt();
			      System.out.println("Processing......");
	              Thread.sleep(2000);
				    if (Payment==1)
			{   System.out.println("\nGpay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
			if (user_bill==bill)
			{
				//Gpay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
					System.out.println("\t\t\tThank you order conform!");
					
				else
					System.out.println("\t\t\tSorry you order faild");
				
			}
			else
				System.out.println("\t\t\tSorry you order faild");
			}
			else
					if(Payment==2)
				{
				System.out.println("\nPhonepay");
				System.out.println("......");
				System.out.print("\nEnter the bill amount here:");
				double user_bill=sc.nextDouble();
				System.out.println("Processing......");
	            Thread.sleep(2000);
				if (user_bill==bill)
			{
				//Phonepay OTP
				int sys_otp=(int)(Math.random()*9999+9999);//OTP Genrated
				System.out.print("\nOTP:");
				Thread.sleep(3000);
				System.out.print(sys_otp);
				System.out.print("\nEnter the OTP Here:");
				int user_otp=sc.nextInt();
				if (sys_otp==user_otp)
				
					System.out.println("\t\t\tThank you!__Your order is conform!");
					
				else
					System.out.println("\t\t\tSorry your order is faild");
			}
			else
				System.out.println("\t\t\tSorry your order is Cancel");
			
				}
				else
				   System.out.println("\t\t\tSorry your order is Cancel");
			}
			else
				System.out.println("\t\t\tSorry your order is Cancel");
			}
		break;}
	
	}
	
}}