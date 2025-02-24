public class streams {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,3,4,5,6,7,8,9);
        int oddHighest = list.stream()
                .filter(i -> i%2 != 0)
                .sorted(Comparator.reverseOrder())
                .findFirst().get();
        System.out.println(oddHighest);
    }
}