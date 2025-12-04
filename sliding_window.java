// Sliding Window approach for subarray sum of size m
public static int birthday(List<Integer> s, int d, int m) {

    int count = 0;

    // Loop until s.size() - m so window stays inside the list
    for (int i = 0; i <= s.size() - m; i++) {

        int sum = 0;

        // Sliding window of size m
        for (int j = 0; j < m; j++) {
            sum += s.get(i + j);
        }

        // If window sum matches required sum d, increment count
        if (sum == d) {
            count++;
        }
    }

    return count;
}
