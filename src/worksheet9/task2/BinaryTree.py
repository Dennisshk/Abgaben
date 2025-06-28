from worksheet9.task2.Node import Node


class BinaryTree:

    def __init__(self):
        self._root = None

    def add(self,value):
        if self._root is None:
            self._root = Node(value)
        else:
            self._root.add_value(value)

    def remove(self,value):

        if self._root is None: return False

        n,p = self._root.get_node_with_parent(value)
        if n is None:
            return False
        else:
            l,r=n.get_children()
            lp,rp=p.get_children()
            if l is None:
                if lp is n:
                     p.set_children(r,rp)
                     return True
                else:
                    p.set_children(lp, r)
                    return True
            elif r is None:
                if lp is n:
                     p.set_children(l,rp)
                     return True
                else:
                    p.set_children(lp, l)
                    return True
            else:
                # remove, wenn zu löschender Knoten 2 Kinder hat
                return True



    def get(self,value):
        if self._root is None:
            return None
        else:
            return self._root.getnode(value)

    def __str__(self):
        if self._root is None:
            return ""
        else:
            return "| "+str(self._root)+" |"

