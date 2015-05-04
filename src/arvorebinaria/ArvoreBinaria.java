/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author 31409695
 */
public class ArvoreBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BinaryTree<String> tree = new BinaryTree<>();
        Node<String> raiz = new Node<>("Raiz");
        Node<String> mackenzie = new Node<>("Mackenzie");
        Node<String> pessoal = new Node<>("Pessoal");
        Node<String> trabalhos = new Node<>("Trabalhos");
        Node<String> programas = new Node<>("Programas");
        Node<String> lp2 = new Node<>("LP2");
        Node<String> estrutura = new Node<>("estrutura");
        
        tree.addRoot(raiz);
        tree.addLeft(raiz, mackenzie);
        tree.addRight(raiz, pessoal);
        tree.addLeft(mackenzie, trabalhos);
        tree.addRight(mackenzie, programas);
        tree.addLeft(programas, lp2);
        tree.addRight(programas, estrutura);
        
        
    }
    
}
