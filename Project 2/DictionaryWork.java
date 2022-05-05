import java.util.*;

public class DictionaryWork {

  Node root;
  static int count = 0;
  int flag = 0;

  Scanner sc = new Scanner(System.in);

  //============================= Note creation======================

  static class Node {

    String word;
    String meaning;
    Node left;
    Node right;

    Node(String word, String meaning) {
      this.word = word; //word
      this.meaning = meaning; //meaning
      this.left = null;
      this.right = null;
      count++;
      System.out.println();
      System.out.println(word + " Word added successfully in your dictionary!");
      System.out.println();
    }
  }

  //==============================insert the new  word===========================

  public void insertWord(String word, String meaning) {
    Node p = root;
    Node par = null;
    // System.out.println("1");
    while (p != null) {
      //System.out.println("2");
      par = p;
      if (word.compareToIgnoreCase(p.word) > 0) {
        p = p.right;
        //System.out.println("3");
      } else if (word.compareToIgnoreCase(p.word) < 0) {
        p = p.left;
        //System.out.println("4");
      } else {
        System.out.println(word + " Word is already present");
        return;
      }
    }
    //System.out.println("5");
    Node temp = new Node(word, meaning);

    if (par == null) root = temp; else if (
      word.compareToIgnoreCase(par.word) < 0
    ) par.left = temp; else par.right = temp;
  }

  //==============================Word count===========================
  int wordcount() {
    System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
    System.out.println(" Total words in the Dictionary = " + count);
    //		System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

    return count;
  }

  //======================= Inorder traversal ===================================
  public void inorder(Node trav) {
    if (trav == null) {
      return;
    }
    inorder(trav.left);
    System.out.println(trav.word + " : " + trav.meaning);
    System.out.println();
    inorder(trav.right);
  }

  //==============================Display the word===========================
  void display() {
    if (wordcount() == 0) {
      System.out.println(" You can add by using Insert words option \n");
      System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
      return;
    }
    System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
    inorder(root);
    System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
  }

  //==============================Search the word===========================

  public boolean searchWord(String word) {
    Node p = root;
    while (p != null) {
      if (word.compareToIgnoreCase(p.word) < 0) p =
        p.left;/*Move to left child*/ else if (
        word.compareToIgnoreCase(p.word) > 0
      ) p = p.right;/*Move to right child */ else {/*word found*/
        System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
        System.out.println(" " + p.word + " : " + p.meaning);
        System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
        return true;
      }
    }
    return false;
  }

  //============= Delete the word ========================

  public void deleteWord(String word) {
    Node p = root;
    Node par = null;

    while (p != null) {
      if (word.compareToIgnoreCase(p.word) == 0) {
        //System.out.println("4");
        break;
      }

      par = p;
      if (word.compareToIgnoreCase(p.word) < 0) p = p.left; else p = p.right;
    } //we found the node to be deleted with pointer p and par as parent of p

    if (p == null) {
      System.out.println(word + " word is not found in your dictionary");
      return;
    }
    //		case 3 : when node to be deleted has two childs

    Node s, sp;
    if (p.left != null && p.right != null) {
      sp = p;
      s = p.right;

      while (s.left != null) {
        sp = s;
        s = s.left;
      }
      p.word = s.word;
      p.meaning = s.meaning;
      p = s;
      par = sp;
    }

    //		case 1 : to delet only node and case 2 : to delete either node

    Node ch;
    if (p.left != null) ch = p.left; else ch = p.right;

    if (par == null) {
      System.out.println(p.word + " Word deleted successfully!");
      root = ch;
      count--;
      //System.out.println("1");
    } else if (p == par.left) {
      System.out.println(par.word + " Word deleted successfully!");
      par.left = ch;
      count--;
    } else {
      System.out.println(par.word + " Word deleted successfully!");
      par.right = ch;
      count--;
      //System.out.println("3");
    }
  }
}
