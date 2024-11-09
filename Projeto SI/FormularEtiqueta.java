
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class FormularEtiqueta extends Frame implements ActionListener {

    protected Dimension dQuadro, dRotulo, dBotao, dCaixaTexto;
    protected Button bImprimir, bCancelar;
    protected TextField tfnomeProduto, tfvalidProduto, tffabricProduto, tfnumLote, tfresponsavel;
    protected Label lnomeProduto, lvalidProduto, lfabricProduto, lnumLote, lresponsavel;

    Etiqueta etiquetaUm = new Etiqueta("", "", "", "", "");

    public FormularEtiqueta() {

        Dimension dQuadro = new Dimension(400, 300);
        Dimension dRotulo = new Dimension(120, 25);
        Dimension dCaixaTexto = new Dimension(180, 25);
        Dimension dBotao = new Dimension(100, 25);

        setTitle("Emissão de Etiqueta");
        setResizable(false);
        setSize(dQuadro);
        setLocation(400, 200);
        setLayout(null);

        lnomeProduto = new Label("Produto");
        lnomeProduto.setSize(dRotulo);
        lnomeProduto.setLocation(25, 50);

        tfnomeProduto = new TextField();
        tfnomeProduto.setSize(dCaixaTexto);
        tfnomeProduto.setLocation(160, 50);

        lfabricProduto = new Label("Data da fabricação");
        lfabricProduto.setSize(dRotulo);
        lfabricProduto.setLocation(25, 90);

        tffabricProduto = new TextField();
        tffabricProduto.setSize(dCaixaTexto);
        tffabricProduto.setLocation(160, 90);

        lvalidProduto = new Label("Data da validade");
        lvalidProduto.setSize(dRotulo);
        lvalidProduto.setLocation(25, 130);

        tfvalidProduto = new TextField();
        tfvalidProduto.setSize(dCaixaTexto);
        tfvalidProduto.setLocation(160, 130);

        lnumLote = new Label("Lote");
        lnumLote.setSize(dRotulo);
        lnumLote.setLocation(25, 170);

        tfnumLote = new TextField();
        tfnumLote.setSize(dCaixaTexto);
        tfnumLote.setLocation(160, 170);

        lresponsavel = new Label("Emissor da etiqueta");
        lresponsavel.setSize(dRotulo);
        lresponsavel.setLocation(25, 210);

        tfresponsavel = new TextField();
        tfresponsavel.setSize(dCaixaTexto);
        tfresponsavel.setLocation(160, 210);

        bImprimir = new Button("Imprimir");
        bImprimir.setSize(dBotao);
        bImprimir.setLocation(140, 250);
        bImprimir.addActionListener(this);

        bCancelar = new Button("Cancelar");
        bCancelar.setSize(dBotao);
        bCancelar.setLocation(250, 250);
        bCancelar.addActionListener(this);

        add(lnomeProduto);
        add(lfabricProduto);
        add(lvalidProduto);
        add(lnumLote);
        add(lresponsavel);
        add(tfnomeProduto);
        add(tffabricProduto);
        add(tfvalidProduto);
        add(tfnumLote);
        add(tfresponsavel);
        add(bCancelar);
        add(bImprimir);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == bImprimir) {
            etiquetaUm.setNomeProduto(tfnomeProduto.getText());
            etiquetaUm.setFabricProduto(tffabricProduto.getText());
            etiquetaUm.setValidProduto(tfvalidProduto.getText());
            etiquetaUm.setNumLote(tfnumLote.getText());
            etiquetaUm.setResponsavel(tfresponsavel.getText());
            JOptionPane.showMessageDialog(null, etiquetaUm.exibirEtiqueta());
        }
        if (evento.getSource() == bCancelar) {
            System.exit(0);
        }
    }

}
