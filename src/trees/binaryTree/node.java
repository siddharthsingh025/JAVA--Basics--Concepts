package trees.binaryTree;

import java.lang.reflect.Constructor;

public class node {

    int data;
    node lefNode;
    node riNode;

    node(int d)
    {
        this.data =d;
        this.lefNode =null;
        this.riNode =null;
    }

    node(int d, node l , node r)
    {
        this.data =d;
        this.lefNode =l;
        this.riNode =r;
    }

}
