from external.light import Light
from commands.command import Command


class LightOffCommand(Command):

    def __init__(self, light: Light) -> None:
        self.light = light

    def execute(self) -> None:
        self.light.off()

    def undo(self) -> None:
        self.light.on()
