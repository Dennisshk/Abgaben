from datetime import datetime


class Mail:
    def __init__(self, sender, address, subject, message):
        self.sender = sender
        self.address = address
        self.subject = subject
        self.message = message
        self.datetime = datetime.now()
        self.read = False

    def __str__(self):
       return self.subject+" from "+ self.sender +" on "+ str(self.datetime)

class Inbox:

    def __init__(self):
        self.mails=[]

    def add(self,mail):
        self.mails.append(mail)

    def print(self,index=None):
        if index is None:
            for mail in self.mails:
                s=str(mail)
                print(s)
        else:
            if not(0 <= index < len(self.mails)):
                print("Index Fehler")
                return
            mail = self.mails[index]
            s=str(mail)
            print(s+": "+mail.message)

    def count_unread(self):
        unread=0
        for mail in self.mails:
            if not mail.read:
                unread+=1
        return unread


if __name__ == '__main__':
    i = Inbox()
    m1 = Mail("A","B","C","sfsdhgdf")
    m2 = Mail("D", "Br", "Cq", "sfsdcvhfchgdf")
    m3 = Mail("E", "Bg", "Cw", "sfssdfbhgddhgdf")
    m4 = Mail("F", "Bh", "Ce", "sfsdhdfhdfgdjkmnigdf")
    m2.read = True
    m4.read = True
    i.add(m1)
    i.add(m2)
    i.add(m3)
    i.add(m4)
    print(str(i.count_unread()))
    i.print()
    i.print(2)