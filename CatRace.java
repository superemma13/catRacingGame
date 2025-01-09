package catrace;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CatRace {

	public static void main(String[] args) throws InterruptedException {
		boolean lpothr = true, lpall = true, lprst = true, lpmtn = true, dorls = true, dorpt = true, dostsodd = true,
				dorptstsodd = true;
		int tie = 0, totalMoney = 100, totalEarn = 0;
		String winr = null, agn, ifrls, ifrpt, ifstsodd, ifrptstsodd;

		int mv[] = new int[5]; // move array
		mv[0] = (0);
		mv[1] = (0);
		mv[2] = (0);
		mv[3] = (0);
		mv[4] = (0);

		int rnmv[] = new int[5]; // random move array
		rnmv[0] = (0);
		rnmv[1] = (0);
		rnmv[2] = (0);
		rnmv[3] = (0);
		rnmv[4] = (0);

		int spee[] = new int[5]; // speed array
		spee[0] = (0);
		spee[1] = (0);
		spee[2] = (0);
		spee[3] = (0);
		spee[4] = (0);

		int streng[] = new int[5]; // strength array
		streng[0] = (0);
		streng[1] = (0);
		streng[2] = (0);
		streng[3] = (0);
		streng[4] = (0);

		int endure[] = new int[5]; // endurance array
		endure[0] = (0);
		endure[1] = (0);
		endure[2] = (0);
		endure[3] = (0);
		endure[4] = (0);

		int statsum[] = new int[5]; // stats sum array
		statsum[0] = (0);
		statsum[1] = (0);
		statsum[2] = (0);
		statsum[3] = (0);
		statsum[4] = (0);

		int odd[] = new int[5]; // odds array
		odd[0] = (0);
		odd[1] = (0);
		odd[2] = (0);
		odd[3] = (0);
		odd[4] = (0);

		int bet[] = new int[5]; // bets array
		bet[0] = (0);
		bet[1] = (0);
		bet[2] = (0);
		bet[3] = (0);
		bet[4] = (0);

		int earn[] = new int[5]; // earnings array
		earn[0] = (0);
		earn[1] = (0);
		earn[2] = (0);
		earn[3] = (0);
		earn[4] = (0);

		String catnm[] = new String[5]; // cat name array
		catnm[0] = (null);
		catnm[1] = (null);
		catnm[2] = (null);
		catnm[3] = (null);
		catnm[4] = (null);

		// create the randoms
		Random rn1 = new Random(); // move
		Random rn2 = new Random();
		Random rn3 = new Random();
		Random rn4 = new Random();
		Random rn5 = new Random();
		Random rnst1 = new Random(); // strength
		Random rnst2 = new Random();
		Random rnst3 = new Random();
		Random rnst4 = new Random();
		Random rnst5 = new Random();
		Random rnsp1 = new Random(); // speed
		Random rnsp2 = new Random();
		Random rnsp3 = new Random();
		Random rnsp4 = new Random();
		Random rnsp5 = new Random();
		Random rned1 = new Random(); // endurance
		Random rned2 = new Random();
		Random rned3 = new Random();
		Random rned4 = new Random();
		Random rned5 = new Random();
		Random rnodd1 = new Random(); // odds
		Random rnodd2 = new Random();
		Random rnodd3 = new Random();
		Random rnodd4 = new Random();
		Random rnodd5 = new Random();

		// a frame is a window that the user sees
		JFrame freRace = new JFrame(); // create the frame
		freRace.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if you don't do this, your program will still run
																// after you close the window
		freRace.setSize(1920, 1050); // the width and height of the frame. Hardcoding like this is not usually a good
										// idea, but it's short and simple. May not work on other monitors / devices
		freRace.setLayout(null); // we are not using a layout manager because we want to manually control the
									// location of all objects (absolute positioning). So disable the layout manager
									// using null. This may prevent images from occasionally appearing in the wrong
									// location

		// use labels to hold the images.
		JLabel labelFinish = new JLabel(); // create a label (finish line)
		labelFinish.setIcon(new ImageIcon("./finishline.png"));
		labelFinish.setBounds((1720), (0), labelFinish.getPreferredSize().width, labelFinish.getPreferredSize().height);

		JLabel labelStart = new JLabel(); // create a label (starting line)
		labelStart.setIcon(new ImageIcon("./startline.png"));
		labelStart.setBounds((180), (0), labelStart.getPreferredSize().width, labelStart.getPreferredSize().height);

		JLabel labelCat1 = new JLabel(); // create a label (Strawberry)
		labelCat1.setIcon(new ImageIcon("./nyancat1.png"));

		JLabel labelCat2 = new JLabel(); // create a label (Wildberry)
		labelCat2.setIcon(new ImageIcon("./nyancat2.png"));

		JLabel labelCat3 = new JLabel(); // create a label (Vanilla)
		labelCat3.setIcon(new ImageIcon("./nyancat3.png"));

		JLabel labelCat4 = new JLabel(); // create a label (Mango)
		labelCat4.setIcon(new ImageIcon("./nyancat4.png"));

		JLabel labelCat5 = new JLabel(); // create a label (Chocolate)
		labelCat5.setIcon(new ImageIcon("./nyancat5.png"));

		JLabel labelBckgrnd = new JLabel(); // create a label (background)
		labelBckgrnd.setIcon(new ImageIcon("./background.png"));
		labelBckgrnd.setBounds((0), (0), labelBckgrnd.getPreferredSize().width, labelBckgrnd.getPreferredSize().height);

		// new text fields to store the input in the variables
		JTextField rcr1 = new JTextField();
		JTextField rcr2 = new JTextField();
		JTextField rcr3 = new JTextField();
		JTextField rcr4 = new JTextField();
		JTextField rcr5 = new JTextField();

		do { // do all
				// resetting all the bets
			bet[0] = 0;
			bet[1] = 0;
			bet[2] = 0;
			bet[3] = 0;
			bet[4] = 0;
			earn[0] = 0;
			earn[1] = 0;
			earn[2] = 0;
			earn[3] = 0;
			earn[4] = 0;
			totalEarn = 0;
			tie = 0;

			// randomizing the stats
			streng[0] = rnst1.nextInt(5) + 1; // strength
			streng[1] = rnst2.nextInt(5) + 1;
			streng[2] = rnst3.nextInt(5) + 1;
			streng[3] = rnst4.nextInt(5) + 1;
			streng[4] = rnst5.nextInt(5) + 1;

			spee[0] = rnsp1.nextInt(5) + 1; // speed
			spee[1] = rnsp2.nextInt(5) + 1;
			spee[2] = rnsp3.nextInt(5) + 1;
			spee[3] = rnsp4.nextInt(5) + 1;
			spee[4] = rnsp5.nextInt(5) + 1;

			endure[0] = rned1.nextInt(5) + 1; // endurance
			endure[1] = rned2.nextInt(5) + 1;
			endure[2] = rned3.nextInt(5) + 1;
			endure[3] = rned4.nextInt(5) + 1;
			endure[4] = rned5.nextInt(5) + 1;

			// adding up the stats
			statsum[0] = streng[0] + spee[0] + endure[0];
			statsum[1] = streng[1] + spee[1] + endure[1];
			statsum[2] = streng[2] + spee[2] + endure[2];
			statsum[3] = streng[3] + spee[3] + endure[3];
			statsum[4] = streng[4] + spee[4] + endure[4];

			// randomizing the odds
			odd[0] = rnodd1.nextInt(9) + 2;
			odd[1] = rnodd2.nextInt(9) + 2;
			odd[2] = rnodd3.nextInt(9) + 2;
			odd[3] = rnodd4.nextInt(9) + 2;
			odd[4] = rnodd5.nextInt(9) + 2;

			// cat1 naming
			if (statsum[0] == 3) {
				catnm[0] = "Pinky";
			}
			if ((statsum[0] >= 4) && (statsum[0] <= 6)) {
				catnm[0] = "Pink Cocktail";
			}
			if ((statsum[0] >= 7) && (statsum[0] <= 11)) {
				catnm[0] = "Strawberry";
			}
			if ((statsum[0] >= 12) && (statsum[0] <= 14)) {
				catnm[0] = "Rose";
			}
			if (statsum[0] == 15) {
				catnm[0] = "Black Cat";
			}
			// cat2 naming
			if (statsum[1] == 3) {
				catnm[1] = "Purpley";
			}
			if ((statsum[1] >= 4) && (statsum[1] <= 6)) {
				catnm[1] = "Grape Soda";
			}
			if ((statsum[1] >= 7) && (statsum[1] <= 11)) {
				catnm[1] = "Wildberry";
			}
			if ((statsum[1] >= 12) && (statsum[1] <= 14)) {
				catnm[1] = "Lilac";
			}
			if (statsum[1] == 15) {
				catnm[1] = "Grey Cat";
			}
			// cat3 naming
			if (statsum[2] == 3) {
				catnm[2] = "Whitey";
			}
			if ((statsum[2] >= 4) && (statsum[2] <= 6)) {
				catnm[2] = "Milk";
			}
			if ((statsum[2] >= 7) && (statsum[2] <= 11)) {
				catnm[2] = "Vanilla";
			}
			if ((statsum[2] >= 12) && (statsum[2] <= 14)) {
				catnm[2] = "Daisy";
			}
			if (statsum[2] == 15) {
				catnm[2] = "White Cat";
			}
			// cat4 naming
			if (statsum[3] == 3) {
				catnm[3] = "Yellowy";
			}
			if ((statsum[3] >= 4) && (statsum[3] <= 6)) {
				catnm[3] = "Orange Juice";
			}
			if ((statsum[3] >= 7) && (statsum[3] <= 11)) {
				catnm[3] = "Mango";
			}
			if ((statsum[3] >= 12) && (statsum[3] <= 14)) {
				catnm[3] = "Sunflower";
			}
			if (statsum[3] == 15) {
				catnm[3] = "Orange Cat";
			}
			// cat5 naming
			if (statsum[4] == 3) {
				catnm[4] = "Blacky";
			}
			if ((statsum[4] >= 4) && (statsum[4] <= 6)) {
				catnm[4] = "Hot Chocolate";
			}
			if ((statsum[4] >= 7) && (statsum[4] <= 11)) {
				catnm[4] = "Chocolate";
			}
			if ((statsum[4] >= 12) && (statsum[4] <= 14)) {
				catnm[4] = "Black Dahlia";
			}
			if (statsum[4] == 15) {
				catnm[4] = "Brown Cat";
			}

			// Give title to different text fields
			Object[] fields = { catnm[0], rcr1, catnm[1], rcr2, catnm[2], rcr3, catnm[3], rcr4, catnm[4], rcr5, };

			// JTable
			// headers for JTable
			String column[] = { "Name", "Strength", "Speed", "Endurance", "Odds" };

			// data for JTable
			Object data[][] = { { "*Name*", "*Strength*", "*Speed*", "*Endurance*", "*Odds*" },
					{ catnm[0], streng[0] + "/5", spee[0] + "/5", endure[0] + "/5", odd[0] + "-1" },
					{ catnm[1], streng[1] + "/5", spee[1] + "/5", endure[1] + "/5", odd[1] + "-1" },
					{ catnm[2], streng[2] + "/5", spee[2] + "/5", endure[2] + "/5", odd[2] + "-1" },
					{ catnm[3], streng[3] + "/5", spee[3] + "/5", endure[3] + "/5", odd[3] + "-1" },
					{ catnm[4], streng[4] + "/5", spee[4] + "/5", endure[4] + "/5", odd[4] + "-1" } };

			JTable statnodd = new JTable(data, column); // creates new table with the column headers and data in it
			statnodd.setRowHeight(166); // adjusts row height

			// provides a scrollable view of the table
			JScrollPane scrollPane = new JScrollPane(statnodd);

			// adds label and table to the stats frame
			freRace.add(scrollPane);

			// the real game starts
			JOptionPane.showMessageDialog(null, "Welcome to the Galactic Cat Racing Center!\n Let's get started.");

			// stating the rules
			do {
				ifrls = JOptionPane
						.showInputDialog("Do you wish to read the rules?\n Type '1' for yes and '2' for no.");

				if (ifrls.equals("1")) {

					do {
						JOptionPane.showMessageDialog(null,
								"Take a close look at the stats and odds coming up next. You will get to choose your bets\nand you can bet on more than one racer! The first number of the odds is the number your\nbet will be multiplied by if you win. If the racer you bet on wins, then you will receive that\nmultiplied amount along with the money you bet back. If the racer bet on doesn’t come in\nfirst place then you will lose the money you bet. Ties for first place automatically make any\nbets void and your money will be returned to you. Good luck! And remember,\nthe house always wins.");
						ifrpt = JOptionPane
								.showInputDialog("Do you wish to repeat the rules?\n Type '1' for yes and '2' for no.");

						if (ifrpt.equals("1")) {
							dorpt = true;
						} else if (ifrpt.equals("2")) {
							dorls = false;
							dorpt = false;
						} else {
							JOptionPane.showMessageDialog(null, "Answer not valid");
							dorpt = true;
						}
					} while (dorpt);
				} else if (ifrls.equals("2")) {
					dorls = false;
				} else {
					JOptionPane.showMessageDialog(null, "Answer not valid");
					dorls = true;
				}
			} while (dorls);

			// movements
			mv[0] = 0;
			mv[1] = 0;
			mv[2] = 0;
			mv[3] = 0;
			mv[4] = 0;
			labelCat1.setBounds((mv[0]), (25), labelCat1.getPreferredSize().width, labelCat1.getPreferredSize().height); // Red

			labelCat2.setBounds((mv[1]), (225), labelCat2.getPreferredSize().width,
					labelCat2.getPreferredSize().height); // Yellow

			labelCat3.setBounds((mv[2]), (425), labelCat3.getPreferredSize().width,
					labelCat3.getPreferredSize().height); // Green

			labelCat4.setBounds((mv[3]), (625), labelCat4.getPreferredSize().width,
					labelCat4.getPreferredSize().height); // Blue

			labelCat5.setBounds((mv[4]), (825), labelCat5.getPreferredSize().width,
					labelCat5.getPreferredSize().height); // Purple

			freRace.add(labelCat1); // place the label (image of the Cat) on the frame
			freRace.add(labelCat2); // place the label (image of the Cat) on the frame
			freRace.add(labelCat3); // place the label (image of the Cat) on the frame
			freRace.add(labelCat4); // place the label (image of the Cat) on the frame
			freRace.add(labelCat5); // place the label (image of the Cat) on the frame
			freRace.add(labelFinish); // place the label (image of the line) on the frame
			freRace.add(labelStart); // place the label (image of the line) on the frame
			freRace.add(labelBckgrnd); // place the label (image of the back) on the frame

			freRace.setVisible(true); // if you move this line above, the Cat locations may not immediately appear in
										// the correct location

			// stats and odds
			do {
				ifstsodd = JOptionPane
						.showInputDialog("Do you wish to read the stats and odds?\n Type '1' for yes and '2' for no.");

				if (ifstsodd.equals("1")) {

					do {
						JOptionPane.showMessageDialog(null, statnodd, "Stats and Odds!", 1);
						ifrptstsodd = JOptionPane.showInputDialog(
								"Do you wish to repeat the stats and odds?\n Type '1' for yes and '2' for no.");

						if (ifrptstsodd.equals("1")) {
							dorptstsodd = true;
						} else if (ifrptstsodd.equals("2")) {
							dostsodd = false;
							dorptstsodd = false;
						} else {
							JOptionPane.showMessageDialog(null, "Answer not valid");
							dorptstsodd = true;
						}
					} while (dorptstsodd);
				} else if (ifstsodd.equals("2")) {
					dostsodd = false;
				} else {
					JOptionPane.showMessageDialog(null, "Answer not valid");
					dostsodd = true;
				}
			} while (dostsodd);

			JOptionPane.showMessageDialog(null, fields, "You're starting with $" + totalMoney + ". Place Your Bets!",
					3);

			String realrcr1 = rcr1.getText();
			String realrcr2 = rcr2.getText();
			String realrcr3 = rcr3.getText();
			String realrcr4 = rcr4.getText();
			String realrcr5 = rcr5.getText();

			if (realrcr1.equals("")) {
				realrcr1 = "0";
			}
			if (realrcr2.equals("")) {
				realrcr2 = "0";
			}
			if (realrcr3.equals("")) {
				realrcr3 = "0";
			}
			if (realrcr4.equals("")) {
				realrcr4 = "0";
			}
			if (realrcr5.equals("")) {
				realrcr5 = "0";
			}

			bet[0] = Integer.parseInt(realrcr1);
			bet[1] = Integer.parseInt(realrcr2);
			bet[2] = Integer.parseInt(realrcr3);
			bet[3] = Integer.parseInt(realrcr4);
			bet[4] = Integer.parseInt(realrcr5);

			totalMoney = totalMoney - bet[0] - bet[1] - bet[2] - bet[3] - bet[4];

			JOptionPane.showMessageDialog(null, "Your total is now $" + totalMoney);

			// cat1 randomB
			if (statsum[0] == 3) {
				rnmv[0] = rn1.nextInt(3) + 1;
			}
			if ((statsum[0] >= 4) && (statsum[0] <= 6)) {
				rnmv[0] = rn1.nextInt(4) + 2;
			}
			if ((statsum[0] >= 7) && (statsum[0] <= 11)) {
				rnmv[0] = rn1.nextInt(6) + 3;
			}
			if ((statsum[0] >= 12) && (statsum[0] <= 14)) {
				rnmv[0] = rn1.nextInt(4) + 6;
			}
			if (statsum[0] == 15) {
				rnmv[0] = rn1.nextInt(3) + 8;
			}
			// cat2 randomB
			if (statsum[1] == 3) {
				rnmv[1] = rn2.nextInt(3) + 1;
			}
			if ((statsum[1] >= 4) && (statsum[1] <= 6)) {
				rnmv[1] = rn2.nextInt(4) + 2;
			}
			if ((statsum[1] >= 7) && (statsum[1] <= 11)) {
				rnmv[1] = rn2.nextInt(6) + 3;
			}
			if ((statsum[1] >= 12) && (statsum[1] <= 14)) {
				rnmv[1] = rn2.nextInt(4) + 6;
			}
			if (statsum[1] == 15) {
				rnmv[1] = rn2.nextInt(3) + 8;
			}
			// cat3 randomB
			if (statsum[2] == 3) {
				rnmv[2] = rn3.nextInt(3) + 1;
			}
			if ((statsum[2] >= 4) && (statsum[2] <= 6)) {
				rnmv[2] = rn3.nextInt(4) + 2;
			}
			if ((statsum[2] >= 7) && (statsum[2] <= 11)) {
				rnmv[2] = rn3.nextInt(6) + 3;
			}
			if ((statsum[2] >= 12) && (statsum[2] <= 14)) {
				rnmv[2] = rn3.nextInt(4) + 6;
			}
			if (statsum[2] == 15) {
				rnmv[2] = rn3.nextInt(3) + 8;
			}
			// cat4 randomB
			if (statsum[3] == 3) {
				rnmv[3] = rn4.nextInt(3) + 1;
			}
			if ((statsum[3] >= 4) && (statsum[3] <= 6)) {
				rnmv[3] = rn4.nextInt(4) + 2;
			}
			if ((statsum[3] >= 7) && (statsum[3] <= 11)) {
				rnmv[3] = rn4.nextInt(6) + 3;
			}
			if ((statsum[3] >= 12) && (statsum[3] <= 14)) {
				rnmv[3] = rn4.nextInt(4) + 6;
			}
			if (statsum[3] == 15) {
				rnmv[3] = rn4.nextInt(3) + 8;
			}
			// cat5 randomB
			if (statsum[4] == 3) {
				rnmv[4] = rn5.nextInt(3) + 1;
			}
			if ((statsum[4] >= 4) && (statsum[4] <= 6)) {
				rnmv[4] = rn5.nextInt(4) + 2;
			}
			if ((statsum[4] >= 7) && (statsum[4] <= 11)) {
				rnmv[4] = rn5.nextInt(6) + 3;
			}
			if ((statsum[4] >= 12) && (statsum[4] <= 14)) {
				rnmv[4] = rn5.nextInt(4) + 6;
			}
			if (statsum[4] == 15) {
				rnmv[4] = rn5.nextInt(3) + 8;
			}

			do { // lpmtn
				agn = JOptionPane.showInputDialog("Type 'A' or 'B' to select your graphic motions.");

				if ((agn.equals("A")) || (agn.equals("a"))) { // older motions
					do { // lpothr
						lpmtn = false;
						lpothr = true;

						Thread.sleep(300);

						// movements
						labelCat1.setBounds((mv[0]), (25), labelCat1.getPreferredSize().width,
								labelCat1.getPreferredSize().height); // Red

						labelCat2.setBounds((mv[1]), (225), labelCat2.getPreferredSize().width,
								labelCat2.getPreferredSize().height); // Yellow

						labelCat3.setBounds((mv[2]), (425), labelCat3.getPreferredSize().width,
								labelCat3.getPreferredSize().height); // Green

						labelCat4.setBounds((mv[3]), (625), labelCat4.getPreferredSize().width,
								labelCat4.getPreferredSize().height); // Blue

						labelCat5.setBounds((mv[4]), (825), labelCat5.getPreferredSize().width,
								labelCat5.getPreferredSize().height); // Purple

						if ((mv[0] >= 1680) || (mv[1] >= 1680) || (mv[2] >= 1680) || (mv[3] >= 1680)
								|| (mv[4] >= 1680)) {
							lpothr = false;
						}

						if ((mv[0] < 1680) && (mv[1] < 1680) && (mv[2] < 1680) && (mv[3] < 1680) && (mv[4] < 1680)) {
							// random movement variables
							// cat1 randomA
							if (statsum[0] == 3) {
								mv[0] = mv[0] + rn1.nextInt(30) + 1;
							}
							if ((statsum[0] >= 4) && (statsum[0] <= 6)) {
								mv[0] = mv[0] + rn1.nextInt(40) + 20;
							}
							if ((statsum[0] >= 7) && (statsum[0] <= 11)) {
								mv[0] = mv[0] + rn1.nextInt(60) + 30;
							}
							if ((statsum[0] >= 12) && (statsum[0] <= 14)) {
								mv[0] = mv[0] + rn1.nextInt(40) + 60;
							}
							if (statsum[0] == 15) {
								mv[0] = mv[0] + rn1.nextInt(30) + 80;
							}
							// cat2 randomA
							if (statsum[1] == 3) {
								mv[1] = mv[1] + rn2.nextInt(30) + 1;
							}
							if ((statsum[1] >= 4) && (statsum[1] <= 6)) {
								mv[1] = mv[1] + rn2.nextInt(40) + 20;
							}
							if ((statsum[1] >= 7) && (statsum[1] <= 11)) {
								mv[1] = mv[1] + rn2.nextInt(60) + 30;
							}
							if ((statsum[1] >= 12) && (statsum[1] <= 14)) {
								mv[1] = mv[1] + rn2.nextInt(40) + 60;
							}
							if (statsum[1] == 15) {
								mv[1] = mv[1] + rn2.nextInt(30) + 80;
							}
							// cat3 randomA
							if (statsum[2] == 3) {
								mv[2] = mv[2] + rn3.nextInt(30) + 1;
							}
							if ((statsum[2] >= 4) && (statsum[2] <= 6)) {
								mv[2] = mv[2] + rn3.nextInt(40) + 20;
							}
							if ((statsum[2] >= 7) && (statsum[2] <= 11)) {
								mv[2] = mv[2] + rn3.nextInt(60) + 30;
							}
							if ((statsum[2] >= 12) && (statsum[2] <= 14)) {
								mv[2] = mv[2] + rn3.nextInt(40) + 60;
							}
							if (statsum[2] == 15) {
								mv[2] = mv[2] + rn3.nextInt(30) + 80;
							}
							// cat4 randomA
							if (statsum[3] == 3) {
								mv[3] = mv[3] + rn4.nextInt(30) + 1;
							}
							if ((statsum[3] >= 4) && (statsum[3] <= 6)) {
								mv[3] = mv[3] + rn4.nextInt(40) + 20;
							}
							if ((statsum[3] >= 7) && (statsum[3] <= 11)) {
								mv[3] = mv[3] + rn4.nextInt(60) + 30;
							}
							if ((statsum[3] >= 12) && (statsum[3] <= 14)) {
								mv[3] = mv[3] + rn4.nextInt(40) + 60;
							}
							if (statsum[3] == 15) {
								mv[3] = mv[3] + rn4.nextInt(30) + 80;
							}
							// cat5 randomA
							if (statsum[4] == 3) {
								mv[4] = mv[4] + rn5.nextInt(30) + 1;
							}
							if ((statsum[4] >= 4) && (statsum[4] <= 6)) {
								mv[4] = mv[4] + rn5.nextInt(40) + 20;
							}
							if ((statsum[4] >= 7) && (statsum[4] <= 11)) {
								mv[4] = mv[4] + rn5.nextInt(60) + 30;
							}
							if ((statsum[4] >= 12) && (statsum[4] <= 14)) {
								mv[4] = mv[4] + rn5.nextInt(40) + 60;
							}
							if (statsum[4] == 15) {
								mv[4] = mv[4] + rn5.nextInt(30) + 80;
							}
						}

						if (mv[0] >= 1680) {
							mv[0] = 1680;
						}
						if (mv[1] >= 1680) {
							mv[1] = 1680;
						}
						if (mv[2] >= 1680) {
							mv[2] = 1680;
						}
						if (mv[3] >= 1680) {
							mv[3] = 1680;
						}
						if (mv[4] >= 1680) {
							mv[4] = 1680;
						}
					} while (lpothr);
				} else if ((agn.equals("B")) || (agn.equals("b"))) { // newer motions
					do { // lpothr
						lpmtn = false;
						lpothr = true;

						Thread.sleep(30);

						// movements
						labelCat1.setBounds((mv[0]), (25), labelCat1.getPreferredSize().width,
								labelCat1.getPreferredSize().height); // Red

						labelCat2.setBounds((mv[1]), (225), labelCat2.getPreferredSize().width,
								labelCat2.getPreferredSize().height); // Yellow

						labelCat3.setBounds((mv[2]), (425), labelCat3.getPreferredSize().width,
								labelCat3.getPreferredSize().height); // Green

						labelCat4.setBounds((mv[3]), (625), labelCat4.getPreferredSize().width,
								labelCat4.getPreferredSize().height); // Blue

						labelCat5.setBounds((mv[4]), (825), labelCat5.getPreferredSize().width,
								labelCat5.getPreferredSize().height); // Purple

						if ((mv[0] >= 1680) || (mv[1] >= 1680) || (mv[2] >= 1680) || (mv[3] >= 1680)
								|| (mv[4] >= 1680)) {
							lpothr = false;
						}

						if ((mv[0] < 1680) && (mv[1] < 1680) && (mv[2] < 1680) && (mv[3] < 1680) && (mv[4] < 1680)) {
							// random movement variables
							mv[0] = mv[0] + rnmv[0];
							mv[1] = mv[1] + rnmv[1];
							mv[2] = mv[2] + rnmv[2];
							mv[3] = mv[3] + rnmv[3];
							mv[4] = mv[4] + rnmv[4];
						}

						if (mv[0] >= 1680) {
							mv[0] = 1680;
						}
						if (mv[1] >= 1680) {
							mv[1] = 1680;
						}
						if (mv[2] >= 1680) {
							mv[2] = 1680;
						}
						if (mv[3] >= 1680) {
							mv[3] = 1680;
						}
						if (mv[4] >= 1680) {
							mv[4] = 1680;
						}
					} while (lpothr);
				} else {
					lpmtn = true;
					JOptionPane.showMessageDialog(null, "That answer is not valid, please try again.");
				}
			} while (lpmtn); // while for motions

			if (mv[0] == 1680) {
				tie = tie + 1;
			}
			if (mv[1] == 1680) {
				tie = tie + 1;
			}
			if (mv[2] == 1680) {
				tie = tie + 1;
			}
			if (mv[3] == 1680) {
				tie = tie + 1;
			}
			if (mv[4] == 1680) {
				tie = tie + 1;
			}

			if (tie >= 2) {
				JOptionPane.showMessageDialog(null, "It's a tie!\nAll bets are off.");
				totalMoney = totalMoney + bet[0] + bet[1] + bet[2] + bet[3] + bet[4];
				JOptionPane.showMessageDialog(null,
						"All your money has been returned to you for a total of $" + totalMoney);
			}
			if (tie == 1) {
				if (mv[0] == 1680) {
					winr = catnm[0];
					if (bet[0] > 0) {
						earn[0] = bet[0] * odd[0];
						earn[0] = earn[0] + bet[0];
					}
				}
				if (mv[1] == 1680) {
					winr = catnm[1];
					if (bet[1] > 0) {
						earn[1] = bet[1] * odd[1];
						earn[1] = earn[1] + bet[1];
					}
				}
				if (mv[2] == 1680) {
					winr = catnm[2];
					if (bet[2] > 0) {
						earn[2] = bet[2] * odd[2];
						earn[2] = earn[2] + bet[2];
					}
				}
				if (mv[3] == 1680) {
					winr = catnm[3];
					if (bet[3] > 0) {
						earn[3] = bet[3] * odd[3];
						earn[3] = earn[3] + bet[3];
					}
				}
				if (mv[4] == 1680) {
					winr = catnm[4];
					if (bet[4] > 0) {
						earn[4] = bet[4] * odd[4];
						earn[4] = earn[4] + bet[4];
					}
				}
				totalEarn = earn[0] + earn[1] + earn[2] + earn[3] + earn[4];
				totalMoney = totalMoney + totalEarn;

				JOptionPane.showMessageDialog(null, "The Winner is " + winr + " !");
				JOptionPane.showMessageDialog(null,
						"You have won $" + totalEarn + "\nYour new total is $" + totalMoney);
			}

			do { // do around restart
				agn = JOptionPane
						.showInputDialog("Do you wish to bet again? Type '1' for yes or '2' for no to respond.");

				if (agn.equals("1")) { // yes restart
					lprst = false;
					lpall = true;
					JOptionPane.showMessageDialog(null, "Lets go again!");
				} else if (agn.equals("2")) { // no restart
					lprst = false;
					lpall = false;
					JOptionPane.showMessageDialog(null, "Thank you for playing!");
					JOptionPane.showMessageDialog(null, "You're leaving with " + totalMoney + " !");
				} else {
					lprst = true;
					JOptionPane.showMessageDialog(null, "That answer is not valid, please try again.");
				}
			} while (lprst); // while for restart

			if (totalMoney >= 1000) {
				lpall = false;
			}

		} while (lpall);
		if (totalMoney >= 1000) {
			JOptionPane.showMessageDialog(null, "did you really think you could beat the house at its own game?");
			JOptionPane.showMessageDialog(null, "well...");
			JOptionPane.showMessageDialog(null, "you were wrong.");
		}
	}
}