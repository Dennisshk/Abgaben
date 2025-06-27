class Student:

    def __init__(self,name):
        self.name=name
        self.courses = []
        self.grades = []
        #self.length = 0

    def setGrade(self,grade,course):
        self.courses.append(course)
        self.grades.append(grade)

    def getAverage(self):
        if len(self.grades)==0:
            return 0
        else:
            sum = 0
            for i in range(0,len(self.grades)):
                sum+=self.grades[i]
            return sum/len(self.grades)

if __name__=='__main__':
    s = Student("student")
    print(s.getAverage())
    s.setGrade(10,"Weiterführende Konzepte der Programmierung")
    s.setGrade(5,"Mathe")
    print(s.getAverage())