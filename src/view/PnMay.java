package view;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("all")
public class PnMay extends JPanel {

	/**
	 * Create the panel.
	 */
	
	// Control + 7 => Structure Code Following Application
	private JSplitPane jSplitPane1;
	// Left
	private JPanel mayleft;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel7;
	
	private JTextField tfName;
	private JTextField tfId;
	private JComboBox<String> cbTinhTrang;
	private JScrollPane jScrollPane2;
	private JTextArea txtGhiChu;
	
	private JPanel jPanel6;
	private JButton btnThem;
	private JButton btnSua;
	private JButton btnNhaplai;
	private JButton btnXoa;
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox2;
	private JTextField tfDongia;
	
	private JPanel mayright;
	private JPanel jPanel1;
	private JPanel jPanel3;
	
	private JPanel jPanel4;
	private JLabel jLabel8;
	private JTextField tfIdF;
	private JLabel jLabel9;
	private JTextField tfNameF;
	private JLabel jLabel10;
	private JLabel jLabel12;
	private JComboBox<String> cbTrangThaiF;
	private JLabel jLabel13;
	private JTextField tfDongiaF;
	private JCheckBox jCheckBox3;
	private JCheckBox jCheckBox4;
	private JButton jButton1;
	
	private JPanel jPanel5;
	private JButton TimKiemF;
	private JButton NhapLaiF;
	private JButton CloseF;
	
	private JPanel jPanel2;
	private JScrollPane jScrollPane1;
	private JTable tbMain;
	
	private ButtonGroup btTrangThai;
	
	public PnMay() {
		btTrangThai = new ButtonGroup();
        jSplitPane1 = new JSplitPane();
        mayleft = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel7 = new JLabel();
        tfName = new JTextField();
        tfId = new JTextField();
        cbTinhTrang = new JComboBox<>();
        jScrollPane2 = new JScrollPane();
        txtGhiChu = new JTextArea();
        jPanel6 = new JPanel();
        btnThem = new JButton();
        btnSua = new JButton();
        btnNhaplai = new JButton();
        btnXoa = new JButton();
        jCheckBox1 = new JCheckBox();
        jCheckBox2 = new JCheckBox();
        tfDongia = new JTextField();
        mayright = new JPanel();
        jPanel1 = new JPanel();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jLabel8 = new JLabel();
        tfIdF = new JTextField();
        jLabel9 = new JLabel();
        tfNameF = new JTextField();
        jLabel10 = new JLabel();
        jLabel12 = new JLabel();
        cbTrangThaiF = new JComboBox<>();
        jLabel13 = new JLabel();
        tfDongiaF = new JTextField();
        jCheckBox3 = new JCheckBox();
        jCheckBox4 = new JCheckBox();
        jButton1 = new JButton();
        jPanel5 = new JPanel();
        TimKiemF = new JButton();
        NhapLaiF = new JButton();
        CloseF = new JButton();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        tbMain = new JTable();
        
        setBackground(new java.awt.Color(242, 242, 242));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(242, 242, 242));
        jSplitPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSplitPane1.setDividerSize(6);
        jSplitPane1.setForeground(new java.awt.Color(0, 102, 255));
        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane1.setOneTouchExpandable(true);

        mayleft.setBackground(new java.awt.Color(242, 242, 242));
        mayleft.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin chi tiết máy", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        mayleft.setMinimumSize(new java.awt.Dimension(325, 478));
        mayleft.setPreferredSize(new java.awt.Dimension(500, 538));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Số thứ tự:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Trạng thái:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tên máy:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tình trạng:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Đơn giá:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Ghi chú:");

        tfName.setPreferredSize(new java.awt.Dimension(59, 24));

        tfId.setEditable(false);
        tfId.setPreferredSize(new java.awt.Dimension(59, 24));

        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTinhTrang.setPreferredSize(new java.awt.Dimension(56, 24));

        txtGhiChu.setColumns(20);
        txtGhiChu.setLineWrap(true);
        txtGhiChu.setRows(5);
        txtGhiChu.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtGhiChu);

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel6.add(btnThem);

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel6.add(btnSua);

        btnNhaplai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNhaplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
        btnNhaplai.setText("Nhập lại");
        btnNhaplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaplaiActionPerformed(evt);
            }
        });
        jPanel6.add(btnNhaplai);

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del.gif"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel6.add(btnXoa);

        btTrangThai.add(jCheckBox1);
        jCheckBox1.setText("ON");

        btTrangThai.add(jCheckBox2);
        jCheckBox2.setText("OFF");

        tfDongia.setPreferredSize(new java.awt.Dimension(59, 24));

        javax.swing.GroupLayout mayleftLayout = new javax.swing.GroupLayout(mayleft);
        mayleft.setLayout(mayleftLayout);
        mayleftLayout.setHorizontalGroup(
            mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mayleftLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)))
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mayleftLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mayleftLayout.createSequentialGroup()
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mayleftLayout.createSequentialGroup()
                                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfDongia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbTinhTrang, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46))))
                    .addGroup(mayleftLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jCheckBox1)
                        .addGap(35, 35, 35)
                        .addComponent(jCheckBox2)
                        .addContainerGap())))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mayleftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(46, 46, 46))
        );
        mayleftLayout.setVerticalGroup(
            mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mayleftLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(mayleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(mayleft);

        mayright.setBackground(new java.awt.Color(242, 242, 242));
        mayright.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh sách máy", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 102, 255))); // NOI18N
        mayright.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("STT:");

        tfIdF.setPreferredSize(new java.awt.Dimension(59, 24));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Tên máy:");

        tfNameF.setPreferredSize(new java.awt.Dimension(59, 24));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Tình Trạng:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Trạng thái:");

        cbTrangThaiF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", " " }));
        cbTrangThaiF.setPreferredSize(new java.awt.Dimension(56, 24));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Đơn giá:");

        tfDongiaF.setPreferredSize(new java.awt.Dimension(59, 24));

        jCheckBox3.setText("ON");

        jCheckBox4.setText("OFF");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("OK");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tfIdF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9)
                                .addGap(132, 132, 132))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbTrangThaiF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDongiaF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfNameF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addGap(29, 29, 29)
                        .addComponent(jCheckBox4)
                        .addGap(389, 389, 389)
                        .addComponent(jButton1)))
                .addGap(9, 9, 9))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfIdF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfNameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbTrangThaiF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(tfDongiaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jButton1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(242, 242, 242));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(242, 242, 242)));
        jPanel5.setLayout(new java.awt.GridLayout(3, 1, 15, 15));

        TimKiemF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TimKiemF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iSearch.png"))); // NOI18N
        TimKiemF.setText("Tìm kiếm ");
        TimKiemF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemFActionPerformed(evt);
            }
        });
        jPanel5.add(TimKiemF);

        NhapLaiF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NhapLaiF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iReset.png"))); // NOI18N
        NhapLaiF.setText("Nhập lại");
        NhapLaiF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapLaiFActionPerformed(evt);
            }
        });
        jPanel5.add(NhapLaiF);

        CloseF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CloseF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iClose.png"))); // NOI18N
        CloseF.setText("Đóng");
        CloseF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseFActionPerformed(evt);
            }
        });
        jPanel5.add(CloseF);

        jPanel3.add(jPanel5, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        mayright.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tbMain.setAutoCreateRowSorter(true);
        tbMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbMain.setModel(new javax.swing.table.DefaultTableModel(
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
        tbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbMainMousePressed(evt);
            }
        });
        tbMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbMainKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbMain);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        mayright.add(jPanel2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(mayright);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
	}

	protected void btnThemActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void btnSuaActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void btnNhaplaiActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void btnXoaActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void TimKiemFActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void CloseFActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void NhapLaiFActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void tbMainKeyReleased(KeyEvent evt) {
		// TODO Auto-generated method stub
		
	}

	protected void tbMainMousePressed(MouseEvent evt) {
		// TODO Auto-generated method stub
		
	}

}