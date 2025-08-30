# Clojure Koans

The Clojure Koans are a fun way to get started with Clojure - no experience
assumed or required.  Follow the instructions below to start making tests pass!

## Getting Started

I recommend starting from a cloned or forked repo. This way you'll be able to
track your progress in Git. You might want to create your own branch - that way
if you pull back the latest koans from master, it'll be a bit easier to manage
the inevitable conflicts if we make changes to exercises you've already
completed.

### Disclaimer

This fork runs the koans with Babashka, a self-contained binary scripting tool
that offers an alternative to running Clojure on the JVM. Babashka uses
[SCI](https://github.com/babashka/sci) for interpreting Clojure, and while SCI
implements only a subset of Clojure, it shouldn't get in the way of our path to
enlightenment here!

### Installation on Your Machine

Requirements:

- [Babashka](https://babashka.org/) (`bb` on your PATH)

Clone this repo and you’re ready to run the tasks below.

## Running the Koans

Run the koans via:

`bb koan:run`

It’s a one-off runner that stops at the first failure (no auto-runner yet), so
re-run `bb koan:run` after editing.

You'll see something like this:

    Now meditate on 01_equalities.clj:6
    ---------------------
    Assertion failed!
    We shall contemplate truth by testing reality, via equality.
    (= __ true)

The output is telling you that you have a failing test in the file named
`01_equalities.clj`, on line 6. So you need to open that file up and make it
pass! You'll always be filling in the blanks to make tests pass.  Sometimes
there could be several correct answers (or even an infinite number): any of them
will work in these cases. Some tests will pass even if you replace the blanks
with whitespace (or nothing) instead of the expected answer. Make sure you give
one correct expression to replace each blank.

The koans differ from normal TDD in that the tests are already written for you,
so you'll have to pay close attention to the failure messages, because up until
the very end, making a test pass means that the next failure message comes up.

While it might be easy (especially at first) to fill in the blanks making things
pass, you should work thoughtfully, making sure you understand why the answer is
what it is. Enjoy your path to Clojure enlightenment!

## Trying more things out

It's very useful to try things out in a REPL (Read-Evaluate-Print Loop) whenever
you get stuck or curious. Run: `bb repl` and you'll be able to type Clojure
expressions in, and see what output they produce.

You can exit the REPL with `CTRL-d`, `:repl/quit`, or `:repl/exit`.

## Contributing

This is an extremely minimal Babashka reintepretation of the original Clojure
Koans project, and some of the functionality is still missing. PRs are very
welcome!

## Credits

All credit goes to the original
[Clojure Koans](https://github.com/functional-koans/clojure-koans) project,
with a dash of [Babashka](https://github.com/babashka/babashka).

## License

The use and distribution terms for this software are covered by the Eclipse
Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which can be
found in the file epl-v10.html at the root of this distribution.  By using this
software in any fashion, you are agreeing to be bound by the terms of this
license.