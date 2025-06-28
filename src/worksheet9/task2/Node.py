class Node:

    def __init__(self,value):
        self._value=value
        self._right = None
        self._left = None

    def getnode(self,value):
        if value == self._value:
            return self
        elif value<self._value:
            if self._left is None:
                return None
            else:
                return self._left.getnode(value)
        else:
            if self._right is None:
                return None
            else:
                return self._right.getnode(value)

    def get_node_with_parent(self,value,parent=None):
        if self._value==value:
            return self,parent
        elif self._value<value:
            if self._right is None: return None,None
            return self._right.get_node_with_parent(value,self)
        else:
            if self._left is None: return None,None
            return self._left.get_node_with_parent(value,self)

    def add_value(self,value):
        if self._value<value:
            if self._right is None:
                self._right=Node(value)
            else:
                self._right.add_value(value)
        else:
            if self._left is None:
                self._left=Node(value)
            else:
                self._left.add_value(value)

    def get_children(self):
        return self._left,self._right


    def __str__(self):
        l = ""
        if self._left is not None:
            l = str(self._left)+" | "
        r = ""
        if self._right is not None:
            r = " | "+str(self._right)
        return l+""+str(self._value)+""+r

    def set_children(self,left,right):
        self._right=right
        self._left=left