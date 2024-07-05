package programming;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BankBalanceApplication {
	private JLabel balanceLabel;
	private static JTextField balanceField;
	private static int balance = 0;

	
	public static void main(String[] args) {
		BankBalanceFrame();
	}
	
	public static void BankBalanceFrame() {
		JPanel basePanel = new JPanel();
		JFrame baseFrame = new JFrame("Frame Title");
		baseFrame.setSize(500, 500);
		baseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		baseFrame.add(basePanel);
		basePanel.setLayout(null);
		
		//Label for balance.
		JLabel balanceLabel = new JLabel("Balance: " + balance);
		balanceLabel.setBounds(10, 10, 150, 100);
		basePanel.add(balanceLabel);
		
		//Label to set NEW balance.
		JLabel newBalance = new JLabel("Set new balance:");
		newBalance.setBounds(100, 10, 150, 100);
		basePanel.add(newBalance);
		
		//Field to set NEW balance.
		JTextField balanceChange = new JTextField();
		balanceChange.setBounds(200, 30, 50, 50);
		basePanel.add(balanceChange);
		
		balanceChange.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				balance = Integer.valueOf(balanceChange.getText());
				balanceLabel.setText("Balance: " + balance);
			}
		});
		
		//Label to WITHDRAW from balance.
		JLabel withdrawLabel = new JLabel("Withdraw: ");
		withdrawLabel.setBounds(150, 200, 150, 100);
		basePanel.add(withdrawLabel);
		
		//Field to set the WITHDRAW amount.
		JTextField withdrawChange = new JTextField();
		withdrawChange.setBounds(215, 225, 50, 50);
		basePanel.add(withdrawChange);
		
		withdrawChange.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int withdraw;
				withdraw = Integer.valueOf(withdrawChange.getText());
				balance = balance - withdraw;
				balanceLabel.setText("Balance: " + balance);
			}
		});
		
		//Label to DEPOSIT to balance.
		JLabel depositLabel = new JLabel("Deposit: ");
		depositLabel.setBounds(10, 200, 150, 100);
		basePanel.add(depositLabel);
		
		//Field to set the DEPOSIT amount.
		JTextField depositChange = new JTextField();
		depositChange.setBounds(75, 225, 50, 50);
		basePanel.add(depositChange);
		
		depositChange.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int deposit;
				deposit = Integer.valueOf(depositChange.getText());
				balance = balance + deposit;
				balanceLabel.setText("Balance: " + balance);
			}
		});
		
		//Button to update balance.
		JButton updateButton = new JButton("Update balance");
		updateButton.setBounds(10, 75, 90, 25);
		basePanel.add(updateButton);
		
		//Button listener.
		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				balanceLabel.setText("Balance: " + balance);
				System.out.println("Balance updated.");
				
			}
		});
		
		
		baseFrame.setVisible(true);
		

		

}
	
}
