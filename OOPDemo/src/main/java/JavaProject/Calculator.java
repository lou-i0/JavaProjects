package JavaProject;

@FunctionalInterface
interface Calculator <T extends Number>                                                                          // generic interface -  to only accept numerci input only
{
        double calculateFees(T clubID);
}
