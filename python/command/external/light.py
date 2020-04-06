
class Light:

    def __init__(self, space: str) -> None:
        self.space = space
    
    def on(self):
        print(f'{self.space} light is on')

    def off(self):
        print(f'{self.space} light is off')
