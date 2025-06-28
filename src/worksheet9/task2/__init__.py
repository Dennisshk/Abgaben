from worksheet9.task2.BinaryTree import BinaryTree

if __name__=='__main__':
    B = BinaryTree()
    B.add(12)
    B.add(43)
    B.add(3)
    B.add(15)
    B.add(435)
    B.add(-3)
    print(str(B))
    B.remove(15)
    print(str(B))
