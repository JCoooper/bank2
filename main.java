
import java.util.ArrayList;
import java.util.Scanner;
//------------------------------------------------------------------------------

class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double money;
		int acc;
		int accType;
		String Cacc;
		String Cacc2;
		double numsDoub;
		int numsint;

		double doll;
		double timeP;
		int acT;
		int wi;

		// int withd = 0;// here

		boolean q = false;

		ArrayList<BAccount> index = new ArrayList<BAccount>();
		index.add(new BAccount(1000, 2, 0));
		index.add(new BAccount(100, 2, 1));

		System.out.println("Create New Account?  Y or N: ");
		Cacc = s.nextLine();

		if (Cacc.equals("Y")) {
			System.out.println("Checking or Savings?  C or S: ");
			Cacc2 = s.nextLine();

			if (Cacc2.equals("C")) {
				System.out.println("Enter Money in Account: ");
				numsDoub = s.nextDouble();
				doll = numsDoub;

				System.out.println("Enter Time Open: ");
				numsDoub = s.nextDouble();
				timeP = numsDoub;

				System.out.println("Enter Account type: ");
				numsint = s.nextInt();
				acT = numsint;

				System.out.println("Enter Amount of Current Withdrawls: ");
				numsint = s.nextInt();
				wi = numsint;
				index.add(new Checking(doll, timeP, acT, wi));
				System.out.println(index.get(2).getBal() + " , " + index.get(2).getAccType() + " , "
						+ index.get(2).getTimeMonths());
				q = true;
			}

		}
		// Checking check = new Checking(0, 0, 0, 0);

		// accType = acc.getAccType();

		while (q == true) {

			String input;
			System.out.println("Enter account number: ");
			acc = s.nextInt();
			accType = index.get(acc).getAccType();

			System.out.println(
					"Enter D if you want to make a deposit, W for Withdrawal, M to reset the month, or Q to quit");
			input = s.nextLine();

			if (input.equals("D")) {
				System.out.println("Enter da moneyz: ");
				money = s.nextInt();
				index.get(acc).setBal(index.get(acc).getBal() + money);
				System.out.println(index.get(acc).getBal());

			} else if (input.equals("W")) {
				if (accType == 1) {// checking
					System.out.println("Enter withdraw amount: ");
					money = s.nextInt();
					index.get(acc).setBal(index.get(acc).getBal() - money);
					// index.get(acc)

					// with = with + 1;// here
					/*
					 * if (withd > 3) {// here
					 * index.get(acc).setBal(index.get(acc).getBal() - 1); } if
					 * (index.get(acc).get)
					 * 
					 * System.out.println(index.get(acc).getBal());
					 * System.out.println(withd);
					 * 
					 * }
					 */

				}

			}
		}
	}
}

/*
 * import java.util.Scanner;
 * //---------------------------------------------------------------------------
 * ---
 * 
 * class main { public static void main(String[] args) { Scanner s = new
 * Scanner(System.in);
 * 
 * double money; double acc;
 * 
 * BAccount acc1 = new BAccount(0, 2, 001);
 * 
 * boolean q = true; String input;
 * System.out.println("Enter da moneyz account number"); acc = s.nextInt();
 * while (q == true) { System.out.println(
 * "Enter D if you want to make a deposit, W for Withdrawal, M to reset the month, or Q to quit"
 * ); input = s.nextLine();
 * 
 * if (input.equals("D")) { System.out.println("Enter da moneyz"); money =
 * s.nextInt();
 * 
 * acc1.setBal(acc1.getBal() + money);
 * 
 * System.out.println(acc1.getBal());
 * 
 * } else if (input.equals("W")) {
 * 
 * }
 * 
 * } } }
 */