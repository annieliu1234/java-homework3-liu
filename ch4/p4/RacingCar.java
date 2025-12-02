class RacingCar extends Car
{
    private int course;

    public RacingCar()
    {
        course = 0;
        System.out.println("生產了賽車");
    }

    public void setCourse(int c)
    {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }
}
