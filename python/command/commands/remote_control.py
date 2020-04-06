from commands.command import Command, NoCommand


class RemoteControl:

    def __init__(self):
        self.on_commands = []
        self.off_commands = []
        
        no_command = NoCommand()

        for _ in range(2):
            self.on_commands.append(no_command)
            self.off_commands.append(no_command)

        self.undo_command = no_command

    def set_command(self, slot: int, on_command: Command, off_command: Command) -> None:
        self.on_commands[slot] = on_command
        self.off_commands[slot] = off_command

    def on_button_was_pushed(self, slot: int) -> None:
        self.on_commands[slot].execute()
        self.undo_command = self.on_commands[slot]

    def off_button_was_pushed(self, slot: int) -> None:
        self.off_commands[slot].execute()
        self.undo_command = self.off_commands[slot]

    def undo_was_pushed(self) -> None:
        self.undo_command.undo()

