package forms;

import connetion.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.kernel.colors.ColorConstants;
import java.io.FileNotFoundException;

public class VentaForm extends javax.swing.JFrame {

    private DefaultTableModel modelo;

    public VentaForm() {
        initComponents();
        setLocationRelativeTo(null);

        modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Producto", "Cantidad", "Precio", "Subtotal"}
        );
        table_productos.setModel(modelo);

        cargarClientes();
        cargarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboClientes = new javax.swing.JComboBox<>();
        comboProductos = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_productos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        comboClientes.setBackground(new java.awt.Color(255, 255, 255));
        comboClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboClientes.setForeground(new java.awt.Color(0, 0, 0));
        comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesActionPerformed(evt);
            }
        });

        comboProductos.setBackground(new java.awt.Color(255, 255, 255));
        comboProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboProductos.setForeground(new java.awt.Color(0, 0, 0));
        comboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductosActionPerformed(evt);
            }
        });

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar ");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Productos");

        table_productos.setBackground(new java.awt.Color(255, 255, 255));
        table_productos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_productos.setForeground(new java.awt.Color(0, 0, 0));
        table_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table_productos);

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Realizar Venta");

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(0, 0, 0));
        btnReportes.setText("Generar Reporte");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cantidad");

        jPanel3.setBackground(new java.awt.Color(244, 244, 245));

        btnFinalizar.setBackground(new java.awt.Color(0, 0, 0));
        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar compra");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(110, 110, 110));
        jLabel5.setText("Total:");

        total.setEditable(false);
        total.setBackground(new java.awt.Color(244, 244, 245));
        total.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        total.setText("0");
        total.setBorder(null);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

        try ( Connection conn = DbConnection.getConnection()) {
            // Calcular el total de la factura
            double totalFactura = calcularTotalFactura();

            // Obtener la fecha actual y el ID del cliente seleccionado
            java.util.Date fecha = new java.util.Date();
            int clienteId = obtenerIdPorNombre(conn, "Cliente", "IdCliente", "Nombre", (String) comboClientes.getSelectedItem());

            // Insertar la factura
            String sqlFactura = "INSERT INTO Factura (IdCliente, Fecha, Total) VALUES (?, ?, ?)";
            try ( PreparedStatement psFactura = conn.prepareStatement(sqlFactura, PreparedStatement.RETURN_GENERATED_KEYS)) {
                psFactura.setInt(1, clienteId);
                psFactura.setDate(2, new java.sql.Date(fecha.getTime()));
                psFactura.setDouble(3, totalFactura);
                psFactura.executeUpdate();

                // Obtener el ID de la factura recién insertada
                try ( ResultSet rs = psFactura.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idFactura = rs.getInt(1);

                        // Insertar los detalles de la factura
                        String sqlDetalle = "INSERT INTO DetalleFactura (IdFactura, IdProducto, Cantidad, Subtotal) VALUES (?, ?, ?, ?)";
                        try ( PreparedStatement psDetalle = conn.prepareStatement(sqlDetalle)) {
                            DefaultTableModel modelo = (DefaultTableModel) table_productos.getModel();
                            int rowCount = modelo.getRowCount();
                            for (int i = 0; i < rowCount; i++) {
                                String productoNombre = (String) modelo.getValueAt(i, 0);
                                int cantidad = (Integer) modelo.getValueAt(i, 1);
                                double subtotal = (Double) modelo.getValueAt(i, 3);

                                int productoId = obtenerIdPorNombre(conn, "Producto", "IdProducto", "Nombre", productoNombre);

                                psDetalle.setInt(1, idFactura);
                                psDetalle.setInt(2, productoId);
                                psDetalle.setInt(3, cantidad);
                                psDetalle.setDouble(4, subtotal);
                                psDetalle.addBatch();

                            }
                            psDetalle.executeBatch();
                        }

                        // Generar el PDF
                        generarFacturaPDF(idFactura);
                    }
                }
            }

            JOptionPane.showMessageDialog(this, "Venta finalizada.");
            DefaultTableModel modelo = (DefaultTableModel) table_productos.getModel();
            modelo.setRowCount(0); // Limpiar la tabla
            limpiarCampos();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al finalizar la venta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String clienteNombre = (String) comboClientes.getSelectedItem();
        String productoNombre = (String) comboProductos.getSelectedItem();
        int cantidad;

        try {
            cantidad = Integer.parseInt(txtCantidad.getText());

            try ( Connection conn = DbConnection.getConnection()) {
                int clienteId = obtenerIdPorNombre(conn, "Cliente", "IdCliente", "Nombre", clienteNombre);
                int productoId = obtenerIdPorNombre(conn, "Producto", "IdProducto", "Nombre", productoNombre);
                double precio = obtenerPrecioPorId(conn, productoId);

                double subtotal = precio * cantidad;

                // Agregar datos a la tabla
                DefaultTableModel modelo = (DefaultTableModel) table_productos.getModel();
                modelo.addRow(new Object[]{productoNombre, cantidad, precio, subtotal});

                recalcularTotal();

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al agregar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void comboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProductosActionPerformed

    private void comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClientesActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        generarReportePDF();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void cargarClientes() {
        comboClientes.removeAllItems();

        comboClientes.removeAllItems();

        try ( Connection conn = DbConnection.getConnection();  PreparedStatement ps = conn.prepareStatement("SELECT IdCliente, Nombre FROM Cliente");  ResultSet rs = ps.executeQuery()) {

            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            while (rs.next()) {
                model.addElement(rs.getString("Nombre"));
            }
            comboClientes.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los clientes.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void cargarProductos() {
        comboProductos.removeAllItems();

        try ( Connection conn = DbConnection.getConnection();  PreparedStatement ps = conn.prepareStatement("SELECT IdProducto, Nombre FROM Producto");  ResultSet rs = ps.executeQuery()) {

            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            while (rs.next()) {
                model.addElement(rs.getString("Nombre"));
            }
            comboProductos.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los productos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int obtenerIdPorNombre(Connection conn, String tabla, String idColumna, String nombreColumna, String nombre) throws SQLException {
        String sql = String.format("SELECT %s FROM %s WHERE %s = ?", idColumna, tabla, nombreColumna);
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(idColumna);
                }
                return -1; // No encontrado
            }
        }
    }

    private double obtenerPrecioPorId(Connection conn, int productoId) throws SQLException {
        String sql = "SELECT Precio FROM Producto WHERE IdProducto = ?";
        try ( PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, productoId);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("Precio");
                }
                return 0; // No encontrado
            }
        }
    }

    private double calcularTotalFactura() {
        double total = 0.0;

        // Obtén el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) table_productos.getModel();

        // Itera a través de las filas de la tabla
        for (int i = 0; i < model.getRowCount(); i++) {
            // Obtén el subtotal de la columna correspondiente
            double subtotal = (Double) model.getValueAt(i, 2);
            total += subtotal;
        }

        return total;
    }

    private void recalcularTotal() {
        DefaultTableModel modelo = (DefaultTableModel) table_productos.getModel();
        double totalFactura = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            totalFactura += (Double) modelo.getValueAt(i, 3); // Columna de subtotal
        }
        total.setText(String.format("%.2f", totalFactura)); // Mostrar el total con dos decimales
    }

    private void limpiarCampos() {
        // Limpiar campos de texto
        txtCantidad.setText("");
        total.setText("");
        comboClientes.setSelectedIndex(-1);
        comboProductos.setSelectedIndex(-1);

        DefaultTableModel modelo = (DefaultTableModel) table_productos.getModel();
        modelo.setRowCount(0); // Eliminar todas las filas de la tabla

        total.setText("0");
    }

    private void generarFacturaPDF(int idFactura) {
        // Definir la ruta donde se guardará el PDF
        String ruta = "D:\\Proyectos IDEs\\Proyectos GitHub Main\\Punto de Venta\\SistemaDeVenta\\Facturas/factura_" + idFactura + ".pdf"; // Guardar en el directorio de trabajo actual

        try {
            // Crear el documento PDF
            PdfWriter writer = new PdfWriter(ruta);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document doc = new Document(pdfDoc);

            // Añadir título y detalles
            doc.add(new Paragraph("Factura #" + idFactura).setFontSize(20).setBold());
            doc.add(new Paragraph(" "));

            // Crear una tabla para los detalles de la factura
            Table table = new Table(new float[]{4, 2, 2, 2});

            // Añadir encabezados de columna
            table.addHeaderCell(new Cell().add(new Paragraph("Producto").setFontColor(ColorConstants.WHITE)).setBackgroundColor(ColorConstants.BLACK));
            table.addHeaderCell(new Cell().add(new Paragraph("Cantidad").setFontColor(ColorConstants.WHITE)).setBackgroundColor(ColorConstants.BLACK));
            table.addHeaderCell(new Cell().add(new Paragraph("Precio").setFontColor(ColorConstants.WHITE)).setBackgroundColor(ColorConstants.BLACK));
            table.addHeaderCell(new Cell().add(new Paragraph("Subtotal").setFontColor(ColorConstants.WHITE)).setBackgroundColor(ColorConstants.BLACK));

            // Conectar a la base de datos y obtener los detalles de la factura
            try ( Connection conn = DbConnection.getConnection()) {
                String sql = "SELECT p.Nombre, df.Cantidad, df.Subtotal FROM DetalleFactura df JOIN Producto p ON df.IdProducto = p.IdProducto WHERE df.IdFactura = ?";
                try ( PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, idFactura);
                    try ( ResultSet rs = ps.executeQuery()) {
                        while (rs.next()) {
                            table.addCell(rs.getString("Nombre"));
                            table.addCell(String.valueOf(rs.getInt("Cantidad")));
                            table.addCell(String.valueOf(rs.getDouble("Subtotal") / rs.getInt("Cantidad")));
                            table.addCell(String.valueOf(rs.getDouble("Subtotal")));
                        }
                    }
                }
            }

            // Añadir la tabla al documento
            doc.add(table);

            // Cerrar el documento
            doc.close();

            JOptionPane.showMessageDialog(this, "Factura generada correctamente");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al generar la factura en PDF.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void generarReportePDF() {
        String pdfPath = "D:\\Proyectos IDEs\\Proyectos GitHub Main\\Punto de Venta\\SistemaDeVenta\\Reportes/Reporte_Ventas.pdf";

        try {
            // Crear un escritor de PDF
            PdfWriter writer = new PdfWriter(pdfPath);

            // Crear un documento PDF
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);

            // Añadir título y detalles
            document.add(new Paragraph("Reporte de Ventas").setFontSize(20).setBold());
            document.add(new Paragraph(" "));

            // Crear una tabla con el número adecuado de columnas
            String[] encabezados = {"IdFactura", "Cliente", "Fecha", "Producto", "Cantidad", "Subtotal", "Total"};
            Table table = new Table(encabezados.length);

            // Agregar encabezados de columna a la tabla
            for (String encabezado : encabezados) {
                table.addHeaderCell(new Cell().add(new Paragraph(encabezado)).setBackgroundColor(ColorConstants.GRAY));
            }

            // Conectar a la base de datos y obtener los detalles de las ventas
            try ( Connection conn = DbConnection.getConnection()) {
                // Verificar si la conexión es exitosa
                if (conn == null) {
                    throw new SQLException("No se pudo establecer una conexión con la base de datos.");
                }

                // Consulta SQL actualizada para obtener los datos
                String sql = "SELECT f.IdFactura, c.Nombre AS Cliente, f.Fecha, p.Nombre AS Producto, "
                        + "df.Cantidad, df.SubTotal, f.Total "
                        + "FROM Cliente c "
                        + "INNER JOIN (Producto p "
                        + "INNER JOIN (Factura f "
                        + "INNER JOIN DetalleFactura df ON f.IdFactura = df.IdFactura) "
                        + "ON p.IdProducto = df.IdProducto) "
                        + "ON c.IdCliente = f.IdCliente";

                try ( PreparedStatement ps = conn.prepareStatement(sql);  ResultSet rs = ps.executeQuery()) {
                    // Verificar si la consulta devuelve resultados
                    boolean hasResults = false;

                    while (rs.next()) {
                        hasResults = true;
                        table.addCell(rs.getString("IdFactura"));
                        table.addCell(rs.getString("Cliente"));
                        table.addCell(rs.getString("Fecha"));
                        table.addCell(rs.getString("Producto"));
                        table.addCell(String.valueOf(rs.getInt("Cantidad")));
                        table.addCell(String.valueOf(rs.getDouble("SubTotal")));
                        table.addCell(String.valueOf(rs.getDouble("Total")));
                    }

                    if (!hasResults) {
                        document.add(new Paragraph("No se encontraron ventas para mostrar."));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    document.add(new Paragraph("Error al ejecutar la consulta SQL: " + e.getMessage()));
                }
            } catch (SQLException e) {
                e.printStackTrace();
                document.add(new Paragraph("Error al conectar a la base de datos: " + e.getMessage()));
            }

            // Agregar la tabla al documento
            document.add(table);

            // Cerrar el documento
            document.close();

            JOptionPane.showMessageDialog(this, "Reporte de ventas en PDF generado correctamente.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al generar el reporte de ventas en PDF.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(VentaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_productos;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
