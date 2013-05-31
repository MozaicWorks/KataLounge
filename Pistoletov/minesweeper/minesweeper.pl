#!/usr/bin/env perl

use strict;
use warnings;

my @lines;
my @the_matrix;

# get all the lines
foreach (<>) {
    chomp;
    print "$_\n";
    push @lines, $_;
}

# fetch the array dimensions (most probably useless )
$lines[0] =~ /^(\d+?)\s(\d+?)$/ or die "Bad karma!";
my $lnr = $1;
my $cnr = $2;

# shift the first line as we don't need it anymore
shift @lines;

# swallow the blue pill
foreach (@lines) {
    my @line;
    foreach (split(//, $_)) {
        push @line, $_ if $_;
    }
    push @the_matrix, [ @line ] if @line;
}

# now I have a matrix of the mine field
# but this is definitely impossible to solve without conditional statements
# i'll just stop here
