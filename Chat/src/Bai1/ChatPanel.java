package Bai1;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class ChatPanel {
	

	private String sender;
	private String receiver;
	private Socket socket;

	public ChatPanel(Socket s, String sender, String receiver) {
		try {
		    //Khởi tạo các Components cho giao diện đồ họa
		    initComponents();
		    
		    //Truyền socket(Socket này sẽ được tạo sau)
		    socket  = s;
		    
		    //Nhận tên người gửi và người nhận
		    this.sender = sender;
		    this.receiver = receiver;
		    
		    //Tạo các bộ đệm để gửi và nhận tin nhắn
		    bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		    os = new DataOutputStream(socket.getOutputStream());
		} catch (Exception e) {
		    System.out.println("Error while create Main Panel");
		}

	    }

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
	