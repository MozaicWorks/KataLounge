#!/usr/bin/env perl

use strict;
use warnings;

use Test::More tests => 5;

use Data::Dumper;

#1
BEGIN { use_ok( 'Dictionary::Replacer' ); }
#2
require_ok( 'Dictionary::Replacer' );

use Dictionary::Replacer;

my $in ;
my $out;
my $expected;
my $test;


#3
$test = 'empty dictionary';
$in  = {};
$expected = {};
$out = hash_rep($in);
is_deeply($expected, $out, $test);


#4
$test = 'not a dictionary';
$in  = 2;
$expected = {};
$out = hash_rep($in);
is_deeply($expected, $out, $test);


#5
$test = 'valid dictionary with actual $ sign keys';
$in  =          {
                    '$eggs$'        => 'spam',
                    '$foo$'         => 'bar',
                    'stan'          => 'bran',
                };
$expected =     {
                    'spam'          => 'spam',
                    'bar'           => 'bar',
                    'stan'          => 'bran',
                };
$out = hash_rep($in);
is_deeply($expected, $out, $test);









