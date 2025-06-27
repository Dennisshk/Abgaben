class Student:
    def __init__(self,age,name):
        self._age = age
        self._name=name
    def __str__(self):
        return "age: "+self._age+", name: "+self._name


if __name__ == '__main__':
    student = Student(23,"Hier müsste ein Name stehen")
    backpapier = Student(True,2)
    #print(student)
    #print(backpapier)