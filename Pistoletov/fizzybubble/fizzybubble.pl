#!/usr/bin/env perl

use strict;
use warnings;

# lame second grader implementation... easy to read though
#for ( my $i = 1; $i <= 100; $i++ ) {
    #if      ( $i % 5 == 0 and $i % 3 == 0 ) {
        #print "FizzBuzz!\n";
    #} elsif ( $i % 3 == 0 ) {
        #print "Fizz!\n";
    #} elsif ( $i % 5 == 0  ) {
        #print "Buzz!\n";
    #} else {
        #print "$i\n";
    #}
#}

# better implementation using ternary operator and implicit variable $_ of a set
print(($_%3?"":"Fizz\n").($_%5?"":"Buzz\n")or"$_\n")for 1..100;

