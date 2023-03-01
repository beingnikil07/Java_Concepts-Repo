// One of the most common mistakes while implementing any sort of looping is
// that it may not ever exit, that is the loop runs for infinite time. This
// happens when the condition fails for some reason.

// Infinite for loop :


class InfiniteForLoop {
    public static void main(String[] args) {
        for (;;) {
        }
    }
}