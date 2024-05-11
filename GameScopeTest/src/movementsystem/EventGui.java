package movementsystem;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import battleSystem.Base.guitestClass;
import movementsystem.events.Ev_TalkToErina;

public class EventGui extends JFrame{
	public static void main(String[] args) {
		EventGui gui = new EventGui();
	}
	private static final long serialVersionUID = 1L;
	eventManager evmanager;
	public static EventGui maingui;
	static ArrayList<message> inbox = new ArrayList<message>();
	boolean hasText = false;
	JFrame frame = this;
	JPanel buttonpanel = new JPanel(new FlowLayout());
	JLabel textbar = new JLabel("test");
	JButton buttons[] = new JButton[4];
	public EventGui() {
		maingui = this;
		arealist.setupAreas();
		eventDatabase database = new eventDatabase();
		questDatabase.setupQuests();
		evmanager = new eventManager(database);
		frame.setTitle("game");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(guitestClass.class.getResource("/images/ball.png")));
		frame.setSize(1000,500);
		frame.setPreferredSize(frame.getSize());
		frame.setContentPane(new JPanel());
		frame.setLayout(new BorderLayout());
		textbar.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(textbar, BorderLayout.CENTER);
		buttonpanel.setSize(1000,110);
		buttonpanel.setMaximumSize(buttonpanel.getSize());
		buttonpanel.setPreferredSize(buttonpanel.getSize());
		frame.getContentPane().add(buttonpanel,BorderLayout.PAGE_END);
		for(int i = 0 ; i < buttons.length ;i++)
		{
			int a = i;
			buttons[i] = new JButton();
			buttons[i].setSize(100, 100);
			buttons[i].setPreferredSize(buttons[i].getSize());
			buttons[i].addActionListener(new ActionListener() {
				final int selection = a;
				eventManager manager = evmanager;
				@Override
				public void actionPerformed(ActionEvent e) {

					if(!hasText)
					{
					if(evmanager.nextevent!= 0)
					{
					manager.eventStart(evmanager.nextevent);
					}
					manager.eventStart(evmanager.party.location.buttonevents[selection]);
					}
					setupbuttons();
				}
			});
			buttonpanel.add(buttons[i]);
		}

		evmanager.eventStart(1);
		frame.pack();
		setupbuttons();
		this.setVisible(true);
	}
	public void setupbuttons()
	{
		hasText = processmsg();
	}
	public boolean processmsg()
	{
		if(!inbox.isEmpty())
		{
			message msg =inbox.get(0);
			System.out.println(msg.msg);
			textbar.setText(msg.msg);
			for(int i = 0 ; i < buttons.length ;i++)
			{
				buttons[i].setText("Continue");
			}
			inbox.remove(0);
			return true;
		}
		if(evmanager.nextevent!=0)
		{
			for(int i = 0 ; i < buttons.length ;i++)
			{
				buttons[i].setText("Continue");
			}
			return false;
		}
		textbar.setText("Party is in " + evmanager.party.location.Name);
		for(int i = 0 ; i < buttons.length ;i++)
		{
			buttons[i].setText(evmanager.masterDatabase.get(evmanager.party.location.buttonevents[i]).name);
		}
		return false;
	}
	public static void sendmsg(String Msg)
	{
		inbox.add(new message(Msg));
	}
	public static void visible(boolean b)
	{
		maingui.setVisible(b);
	}
}
