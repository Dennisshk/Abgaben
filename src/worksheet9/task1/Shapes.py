import math
from abc import ABC,abstractmethod


class Shape(ABC):
    @abstractmethod
    def getArea(self):
        pass

class Circle(Shape):
    def __init__(self,radius):
        self._radius=radius

    def getArea(self):
        r = self._radius
        #Bleibt eigentlich r jetzt nicht ein Objektattribut? Kann man das löschen?
        return r*r*math.pi