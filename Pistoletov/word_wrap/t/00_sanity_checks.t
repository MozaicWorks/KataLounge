#!/usr/bin/env perl

use strict;
use warnings;

use Test::More;

use Data::Dumper;

#1
BEGIN { use_ok( 'Word::Wrap' ); }
#2
require_ok( 'Word::Wrap' );

use Word::Wrap;

my $in ;
my $col;
my $expected;
my $out;




#3
$in  = "word";
$col = 1;
$expected = "word";
$out = word_wrap($in, $col);
ok(check($in, $out, $col), 'one word col lower than string length');




done_testing();

# mighty tester
sub check {
    my $original    = shift;
    my $text        = shift;
    my $col         = shift;
    diag($original);
    diag($text);
    diag($col);
    my @lines       = split("\n",$text);
    my $ret         = 1;
    # check wrapping
    foreach my $line (@lines) { if (length($line) > $col) { $ret = 0 } }
    # check string is not altered
    my $recstr = join(" ", @lines);
    diag("recstr: ".$recstr);
    if ($recstr ne $original) { $ret = 0 }
    diag("ret: ".$ret);
    return $ret;
}
