package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerDateModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


@SuppressWarnings("all")
public class PnUser extends JPanel {

	/**
	 * Create the panel.
	 */
	// Control + 7 => Structure Code Following Application
	private JSplitPane jSplitPane1;
	// Left
	private JPanel Left;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;

	private JTextField jTextField1;
	private JComboBox<Object> jComboBox1;
	private JSpinner jSpinner1;
	private JSpinner jSpinner2;
	private JSpinner jSpinner3;
	
	private JPanel jPanel1;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	
	// Right
	private JPanel Right;
	
	private JPanel Table;
	private JScrollPane jScrollPane1;
	private JTable jTable1;
	
	private JPanel Search;
	
	private JPanel jPanel2;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JSpinner jSpinner4;
	private JTextField jTextField2;
	private JTextField jTextField3;
	
	private JPanel jPanel3; 
	private JButton jButton5;
	private JButton jButton6;
	private JButton jButton7;
	
	public PnUser() {
		
	jSplitPane1 = new JSplitPane();
    Left = new JPanel();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    jLabel5 = new JLabel();
    jTextField1 = new JTextField();
    jComboBox1 = new JComboBox<>();
    jSpinner1 = new JSpinner();
    jSpinner2 = new JSpinner();
    jSpinner3 = new JSpinner();
    jPanel1 = new JPanel();
    jButton1 = new JButton();
    jButton2 = new JButton();
    jButton3 = new JButton();
    jButton4 = new JButton();
    Right = new JPanel();
    Table = new JPanel();
    jScrollPane1 = new JScrollPane();
    jTable1 = new JTable();
    Search = new JPanel();
    jPanel2 = new JPanel();
    jLabel6 = new JLabel();
    jLabel7 = new JLabel();
    jLabel8 = new JLabel();
    jSpinner4 = new JSpinner();
    jTextField2 = new JTextField();
    jTextField3 = new JTextField();
    jPanel3 = new JPanel();
    jButton5 = new JButton();
    jButton6 = new JButton();
    jButton7 = new JButton();
		
	setLayout(new BorderLayout());
	jSplitPane1.setOneTouchExpandable(true);
	
	Left = new JPanel();
	Left.setBorder(BorderFactory.createTitledBorder(null, "Thông tin chi tiết phiên người dùng", TitledBorder.LEFT, TitledBorder.TOP, new Font("Tahoma", 1, 12), new Color(0, 0, 255))); // NOI18N

    jLabel1.setFont(new Font("Tahoma", 0, 12)); // NOI18N
    jLabel1.setText("STT:");

    jLabel2.setFont(new Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setText("Thứ tự máy:");

    jLabel3.setFont(new Font("Tahoma", 0, 12)); // NOI18N
    jLabel3.setText("Thời gian bắt đầu:");

    jLabel4.setFont(new Font("Tahoma", 0, 12)); // NOI18N
    jLabel4.setText("Tổng thời gian:");

    jLabel5.setFont(new Font("Tahoma", 0, 12)); // NOI18N
    jLabel5.setText("Thời gian chơi:");

    jTextField1.setEditable(false);
    jTextField1.setPreferredSize(new Dimension(59, 24));

    jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    jComboBox1.setPreferredSize(new Dimension(56, 24));

    jSpinner1.setModel(new SpinnerDateModel());
    jSpinner1.setEditor(new JSpinner.DateEditor(jSpinner1, "hh:MM:ss"));
    jSpinner1.setPreferredSize(new Dimension(29, 24));

    jSpinner2.setModel(new SpinnerDateModel());
    jSpinner2.setEditor(new JSpinner.DateEditor(jSpinner2, "hh:MM:ss"));
    jSpinner2.setPreferredSize(new Dimension(29, 24));

    jSpinner3.setModel(new SpinnerDateModel());
    jSpinner3.setEditor(new JSpinner.DateEditor(jSpinner3, "hh:MM:ss"));
    jSpinner3.setPreferredSize(new Dimension(29, 24));
	
    
    jButton1.setFont(new Font("Tahoma", 1, 11)); // NOI18N
    jButton1.setIcon(new ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
    jButton1.setText("Tìm kiếm");
    jPanel1.add(jButton1);

    jButton2.setFont(new Font("Tahoma", 1, 11)); // NOI18N
    jButton2.setIcon(new ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
    jButton2.setText("Sửa");
    jPanel1.add(jButton2);

    jButton3.setFont(new Font("Tahoma", 1, 11)); // NOI18N
    jButton3.setIcon(new ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
    jButton3.setText("Nhập lại");
    jPanel1.add(jButton3);

    jButton4.setFont(new Font("Tahoma", 1, 11)); // NOI18N
    jButton4.setIcon(new ImageIcon(getClass().getResource("/images/del.gif"))); // NOI18N
    jButton4.setText("Xóa");
    jPanel1.add(jButton4);

    // Banner Searching
    GroupLayout LeftLayout = new GroupLayout(Left);
    Left.setLayout(LeftLayout);
    LeftLayout.setHorizontalGroup(
        LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(LeftLayout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addGroup(LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel4)
                .addComponent(jLabel5))
            .addGap(29, 29, 29)
            .addGroup(LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LeftLayout.createSequentialGroup()
                    .addGroup(LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jSpinner2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(31, 31, 31)))
            .addGap(30, 30, 30))
        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    LeftLayout.setVerticalGroup(
        LeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(LeftLayout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addGroup(LeftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addGroup(LeftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(13, 13, 13)
            .addGroup(LeftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jSpinner3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(LeftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(jSpinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(17, 17, 17)
            .addGroup(LeftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(jSpinner2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    );

    jSplitPane1.setLeftComponent(Left);

    Right.setBorder(BorderFactory.createTitledBorder(null, "Danh sách phiên người dùng", TitledBorder.LEFT, TitledBorder.TOP, new Font("Tahoma", 1, 12), new Color(0, 102, 255))); // NOI18N
    Right.setLayout(new java.awt.BorderLayout());

    Table.setBorder(BorderFactory.createTitledBorder(null, "Danh sách", TitledBorder.LEFT, TitledBorder.TOP, new Font("Tahoma", 1, 12), new Color(0, 102, 255))); // NOI18N
    Table.setLayout(new BorderLayout());

    jTable1.setModel(new DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPane1.setViewportView(jTable1);

    Table.add(jScrollPane1, BorderLayout.CENTER);

    Right.add(Table, BorderLayout.CENTER);

    Search.setBorder(BorderFactory.createTitledBorder(null, "Tìm kiếm thông tin", TitledBorder.LEFT, TitledBorder.TOP, new Font("Tahoma", 1, 12), new Color(0, 102, 255))); // NOI18N
    Search.setLayout(new BorderLayout());

    jLabel6.setFont(new Font("Tahoma", 0, 12)); // NOI18N
    jLabel6.setText("ID:");

    jLabel7.setFont(new Font("Tahoma", 0, 12)); // NOI18N
    jLabel7.setText("ID Máy:");

    jLabel8.setFont(new Font("Tahoma", 0, 12)); // NOI18N
    jLabel8.setText("Thời gian bắt đầu:");

    jSpinner4.setPreferredSize(new Dimension(29, 24));

    jTextField2.setPreferredSize(new Dimension(59, 24));

    jTextField3.setPreferredSize(new Dimension(59, 24));
    
    // Banner Searching
    GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(64, 64, 64)
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel8)
                    .addGap(18, 18, 18)
                    .addComponent(jSpinner4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(18, 18, 18)
                    .addComponent(jTextField3, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addGap(85, 85, 85)
                    .addComponent(jLabel7)
                    .addGap(29, 29, 29)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
            .addGap(274, 274, 274))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jLabel7)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(25, 25, 25)
            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(jSpinner4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addContainerGap(36, Short.MAX_VALUE))
    );
    
    Search.add(jPanel2, java.awt.BorderLayout.WEST);

    jPanel3.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(242, 242, 242)));
    jPanel3.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

    jButton5.setFont(new Font("Tahoma", 1, 12)); // NOI18N
    jButton5.setIcon(new ImageIcon(getClass().getResource("/images/iSearch.png"))); // NOI18N
    jButton5.setText("Tìm kiếm");
    jPanel3.add(jButton5);

    jButton6.setText("jButton6");
    jPanel3.add(jButton6);

    jButton7.setText("jButton7");
    jPanel3.add(jButton7);

    Search.add(jPanel3, java.awt.BorderLayout.CENTER);

    Right.add(Search, java.awt.BorderLayout.PAGE_START);

    jSplitPane1.setRightComponent(Right);

    add(jSplitPane1, java.awt.BorderLayout.CENTER);
	}
}
