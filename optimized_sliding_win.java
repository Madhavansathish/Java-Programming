public static int birthday(List<Integer> s, int d, int m) {

    int count = 0;

    // Step 1: Compute initial window sum
    int windowSum = 0;
    for (int i = 0; i < m; i++) {
        windowSum += s.get(i);
    }

    // Check first window
    if (windowSum == d) count++;

    // Step 2: Slide the window across the list
    for (int i = m; i < s.size(); i++) {
        windowSum += s.get(i);        // add new element
        windowSum -= s.get(i - m);    // remove outgoing element

        if (windowSum == d) count++;
    }

    return count;
}
