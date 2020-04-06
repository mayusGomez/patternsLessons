from abc import ABC, abstractmethod


class Command(ABC):

    @abstractmethod
    def execute(self) -> None:
        pass

    @abstractmethod
    def undo(self) -> None:
        pass


class NoCommand(Command):
    def execute(self) -> None:
        pass

    def undo(self) -> None:
        pass
