from external.light import Light
from commands.light_off_command import LightOffCommand
from commands.light_on_command import LightOnCommand
from remote_control import RemoteControl

if __name__ == "__main__":
    kitchen_light = Light('Kitchen')
    kitchen_light_on = LightOnCommand(kitchen_light)
    kitchen_light_off = LightOffCommand(kitchen_light)

    rest_room_light = Light('Rest Room')
    rest_room_light_on = LightOnCommand(rest_room_light)
    rest_room_light_off = LightOffCommand(rest_room_light)

    remote = RemoteControl()
    remote.set_command(0, kitchen_light_on, kitchen_light_off)
    remote.set_command(1, rest_room_light_on, rest_room_light_off)

    remote.on_button_was_pushed(0)
    remote.on_button_was_pushed(1)
    remote.off_button_was_pushed(0)
    remote.undo_was_pushed()

