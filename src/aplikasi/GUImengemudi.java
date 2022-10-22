package aplikasi;

import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JFrame;

public class GUImengemudi extends javax.swing.JFrame {
int telp,manual,matic,harga;
    private void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama");
        model.addColumn("Telepon");
        model.addColumn("Tanggal Daftar");
        model.addColumn("Paket");
        model.addColumn("Jenis Mobil");
        model.addColumn("Harga");
        try{
            int no = 1;
            String sql = "SELECT * FROM pesan";
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});

            }
            tbdata.setModel(model);
            
        }catch(SQLException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    public GUImengemudi() {
        initComponents();
        tampilkan_data();
        setExtendedState (JFrame.MAXIMIZED_HORIZ);
        setVisible (true);
        setResizable (false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        GroupJenis = new javax.swing.ButtonGroup();
        bodypanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        btn_pesan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_harga = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        pesanPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        profilePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_telp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tanggal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        paket = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        rb_matic = new javax.swing.JRadioButton();
        rb_manual = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        prosesPanel1 = new javax.swing.JPanel();
        btn_tambah = new javax.swing.JButton();
        btn_input = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        footerPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        hargaPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        belajarPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        mengulangPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        bodypanel.setBackground(new java.awt.Color(75, 123, 229));
        bodypanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(75, 123, 229));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        btn_pesan.setText("PESAN");
        btn_pesan.setPreferredSize(new java.awt.Dimension(77, 29));
        btn_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesanActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 24)); // NOI18N
        jLabel2.setText("WELCOME");

        btn_harga.setText("HARGA");
        btn_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hargaActionPerformed(evt);
            }
        });

        btn_keluar.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2)))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_pesan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btn_pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btn_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        bodypanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 25, -1, 706));

        mainPanel.setBackground(new java.awt.Color(75, 123, 229));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        mainPanel.setLayout(new java.awt.CardLayout());

        pesanPanel.setBackground(new java.awt.Color(111, 223, 223));
        pesanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pesanPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        tbdata.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        tbdata.setModel(new javax.swing.table.DefaultTableModel(
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
        tbdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbdata);

        pesanPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 760, 290));

        jPanel4.setBackground(new java.awt.Color(26, 60, 64));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Pemesanan Kursus Mengemudi");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pesanPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 780, 90));

        profilePanel.setBackground(new java.awt.Color(75, 123, 229));
        profilePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Nama ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("No Telepon");

        txt_nama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        txt_telp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telpActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Tanggal Daftar ");

        txt_tanggal.setBackground(new java.awt.Color(240, 240, 240));
        txt_tanggal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tanggalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nama))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telp))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pesanPanel.add(profilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 390, 190));

        jPanel2.setBackground(new java.awt.Color(75, 123, 229));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Paket ");

        paket.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        paket.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilihan", "Belajar", "Mengulang" }));
        paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Jenis");

        rb_matic.setBackground(new java.awt.Color(75, 123, 229));
        GroupJenis.add(rb_matic);
        rb_matic.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rb_matic.setForeground(new java.awt.Color(255, 255, 255));
        rb_matic.setText("Matic");
        rb_matic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_maticActionPerformed(evt);
            }
        });

        rb_manual.setBackground(new java.awt.Color(75, 123, 229));
        GroupJenis.add(rb_manual);
        rb_manual.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rb_manual.setForeground(new java.awt.Color(255, 255, 255));
        rb_manual.setText("Manual");
        rb_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_manualActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Harga");

        txt_harga.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rb_manual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paket, 0, 150, Short.MAX_VALUE)
                            .addComponent(rb_matic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_harga)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paket, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_matic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_manual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txt_harga))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pesanPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 360, 190));

        prosesPanel1.setBackground(new java.awt.Color(75, 123, 229));
        prosesPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        btn_tambah.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_tambah.setText("Tambahkan");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_input.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_input.setText("Input lagi");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout prosesPanel1Layout = new javax.swing.GroupLayout(prosesPanel1);
        prosesPanel1.setLayout(prosesPanel1Layout);
        prosesPanel1Layout.setHorizontalGroup(
            prosesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prosesPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        prosesPanel1Layout.setVerticalGroup(
            prosesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prosesPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(prosesPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_input, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pesanPanel.add(prosesPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 760, 80));

        footerPanel.setBackground(new java.awt.Color(111, 223, 223));

        jLabel11.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap(765, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pesanPanel.add(footerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 780, 50));

        mainPanel.add(pesanPanel, "card2");

        hargaPanel.setBackground(new java.awt.Color(111, 223, 223));
        hargaPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jPanel1.setBackground(new java.awt.Color(26, 60, 64));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Harga Paket Pemesanan Kursus Mengemudi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );

        belajarPanel.setBackground(new java.awt.Color(3, 83, 151));
        belajarPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Paket BELAJAR");

        jPanel6.setBackground(new java.awt.Color(111, 223, 223));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel14.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 51));
        jLabel14.setText("Harga");
        jPanel6.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Manual : Rp 1.000.000.,-");
        jPanel6.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Matic : Rp 1.200.000.,-");
        jPanel6.add(jLabel16);

        jPanel7.setBackground(new java.awt.Color(111, 223, 223));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel7.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel17.setText("Kelebihan");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(60, 10, 138, 32);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("- Instruktur Berpengalaman");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(10, 50, 210, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("- Mobil Bersih dan Wangi");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(10, 90, 200, 22);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("- Full AC");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(10, 130, 190, 22);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("- Durasi 20 Jam, 2 Jam/hari");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(10, 170, 210, 22);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("- Waktu Fleksibel");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(10, 210, 200, 20);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("- Double Control Rem");
        jPanel7.add(jLabel23);
        jLabel23.setBounds(10, 250, 210, 22);

        javax.swing.GroupLayout belajarPanelLayout = new javax.swing.GroupLayout(belajarPanel);
        belajarPanel.setLayout(belajarPanelLayout);
        belajarPanelLayout.setHorizontalGroup(
            belajarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(belajarPanelLayout.createSequentialGroup()
                .addGroup(belajarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(belajarPanelLayout.createSequentialGroup()
                        .addGroup(belajarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(belajarPanelLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel13))
                            .addGroup(belajarPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, belajarPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        belajarPanelLayout.setVerticalGroup(
            belajarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(belajarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mengulangPanel.setBackground(new java.awt.Color(3, 83, 151));

        jLabel24.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Paket Mengulang");

        jPanel8.setBackground(new java.awt.Color(111, 223, 223));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel25.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 51));
        jLabel25.setText("Harga");
        jPanel8.add(jLabel25);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("Manual : Rp 500.000.,-");
        jPanel8.add(jLabel26);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Matic : Rp 600.000.,-");
        jPanel8.add(jLabel27);

        jPanel9.setBackground(new java.awt.Color(111, 223, 223));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel9.setLayout(null);

        jLabel28.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel28.setText("Kelebihan");
        jPanel9.add(jLabel28);
        jLabel28.setBounds(60, 10, 138, 32);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setText("- Instruktur Berpengalaman");
        jPanel9.add(jLabel29);
        jLabel29.setBounds(10, 50, 210, 30);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("- Mobil Bersih dan Wangi");
        jPanel9.add(jLabel30);
        jLabel30.setBounds(10, 90, 200, 22);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("- Full AC");
        jPanel9.add(jLabel31);
        jLabel31.setBounds(10, 130, 190, 22);

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel32.setText("- Durasi 10 Jam, 2 Jam/hari");
        jPanel9.add(jLabel32);
        jLabel32.setBounds(10, 170, 210, 22);

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setText("- Waktu Fleksibel");
        jPanel9.add(jLabel33);
        jLabel33.setBounds(10, 210, 200, 20);

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("- Double Control Rem");
        jPanel9.add(jLabel34);
        jLabel34.setBounds(10, 250, 210, 22);

        javax.swing.GroupLayout mengulangPanelLayout = new javax.swing.GroupLayout(mengulangPanel);
        mengulangPanel.setLayout(mengulangPanelLayout);
        mengulangPanelLayout.setHorizontalGroup(
            mengulangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mengulangPanelLayout.createSequentialGroup()
                .addGroup(mengulangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mengulangPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mengulangPanelLayout.createSequentialGroup()
                        .addGroup(mengulangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mengulangPanelLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel24))
                            .addGroup(mengulangPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mengulangPanelLayout.setVerticalGroup(
            mengulangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mengulangPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(46, 46, 46)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout hargaPanelLayout = new javax.swing.GroupLayout(hargaPanel);
        hargaPanel.setLayout(hargaPanelLayout);
        hargaPanelLayout.setHorizontalGroup(
            hargaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(hargaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(belajarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(mengulangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        hargaPanelLayout.setVerticalGroup(
            hargaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hargaPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hargaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mengulangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(belajarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainPanel.add(hargaPanel, "card3");

        bodypanel.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 25, 780, 710));

        getContentPane().add(bodypanel, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hargaActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(hargaPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btn_hargaActionPerformed

    private void btn_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesanActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(pesanPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btn_pesanActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        int answer = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin keluar?","Keluar",JOptionPane.OK_OPTION);
        if (answer==JOptionPane.OK_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM pesan WHERE nama ='"+txt_nama.getText()+"'";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement (sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus...");
            tampilkan_data();
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        String jenis_mobil = null;
        if(rb_matic.isSelected()){
            jenis_mobil="Matic";
        }
        else if (rb_manual.isSelected()){
            jenis_mobil = "Manual";
        }
        try{
            String sql = "UPDATE pesan SET Nama ='"+txt_nama.getText()
            +"',Telepon='"+txt_telp.getText()
            +"',Tanggal_daftar='"+txt_tanggal.getText()
            +"',Paket='"+paket.getSelectedItem()
            +"',Jenis_mobil='"+jenis_mobil
            +"',Harga='"+txt_harga.getText()
            +"' WHERE Nama= '"+ txt_nama.getText() +"'";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement (sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Edit Data Berhasil...");
            tampilkan_data();
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        GroupJenis.clearSelection();
        txt_nama.setText("");
        txt_telp.setText("");
        txt_tanggal.setText("");
        paket.setSelectedItem("Pilihan");
        txt_harga.setText("");
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        String jenis_mobil = null;
        if(rb_matic.isSelected()){
            jenis_mobil="Matic";
        }
        else if (rb_manual.isSelected()){
            jenis_mobil = "Manual";
        }
        try{
            String sql = "INSERT INTO pesan VALUES ('"+txt_nama.getText()+
            "','"+txt_telp.getText()+
            "','"+txt_tanggal.getText()+
            "','"+paket.getSelectedItem()+
            "','"+jenis_mobil+
            "','"+txt_harga.getText()+"')";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement (sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Data berhasil ditambahkan ...");
            tampilkan_data();
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void rb_manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_manualActionPerformed
        // TODO add your handling code here:
        if(rb_manual.isSelected()){
            txt_harga.setText(String.valueOf(manual));
        }
    }//GEN-LAST:event_rb_manualActionPerformed

    private void rb_maticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_maticActionPerformed
        // TODO add your handling code here:
        if(rb_matic.isSelected()){
            txt_harga.setText(String.valueOf(matic));
        }
    }//GEN-LAST:event_rb_maticActionPerformed

    private void paketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketActionPerformed
        // TODO add your handling code here:
        if (paket.getSelectedItem().equals("Pilih Paket")){
            buttonGroup1.clearSelection();
            txt_harga.setText("");
        }
        else if (paket.getSelectedItem().equals("Belajar")){
            manual=1000000;
            matic=1200000;
        }
        else if (paket.getSelectedItem().equals("Mengulang")){
            manual=500000;
            matic=600000;
        }
    }//GEN-LAST:event_paketActionPerformed

    private void txt_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tanggalActionPerformed

    private void txt_telpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telpActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void tbdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdataMouseClicked
        // TODO add your handling code here:
        int baris = tbdata.rowAtPoint(evt.getPoint());
        String Nama = tbdata.getValueAt(baris,1).toString();
        txt_nama.setText(Nama);

        String Telepon = tbdata.getValueAt(baris,2).toString();
        txt_telp.setText(Telepon);

        String Tanggal_daftar = tbdata.getValueAt(baris,3).toString();
        txt_tanggal.setText(Tanggal_daftar);

        String Paket = tbdata.getValueAt(baris,4).toString();
        paket.setSelectedItem(Paket);

        if ("Matic".equals(tbdata.getValueAt(baris,5).toString())){
            rb_matic.setSelected(true);
        }
        else {
            rb_manual.setSelected(true);
        }

        String Harga = tbdata.getValueAt(baris, 6).toString();
        txt_harga.setText(Harga);
    }//GEN-LAST:event_tbdataMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUImengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUImengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUImengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUImengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUImengemudi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupJenis;
    private javax.swing.JPanel belajarPanel;
    private javax.swing.JPanel bodypanel;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_harga;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_pesan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel hargaPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mengulangPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JComboBox paket;
    private javax.swing.JPanel pesanPanel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPanel prosesPanel1;
    private javax.swing.JRadioButton rb_manual;
    private javax.swing.JRadioButton rb_matic;
    private javax.swing.JTable tbdata;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_tanggal;
    private javax.swing.JTextField txt_telp;
    // End of variables declaration//GEN-END:variables
}
