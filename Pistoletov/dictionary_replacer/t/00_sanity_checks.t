#!/usr/bin/env perl

use strict;
use warnings;

use Test::More tests => 10;

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
                    '$stan$'        => 'bran',
                };
$expected =     {
                    'spam'          => 'spam',
                    'bar'           => 'bar',
                    'bran'          => 'bran',
                };
$out = hash_rep($in);
is_deeply($expected, $out, $test);


#6
$test = 'valid dictionary with no $ sign keys';
$in  =          {
                    'eggs'          => 'spam',
                    'foo'           => 'bar',
                    'stan'          => 'bran',
                };
$expected =     {
                    'eggs'          => 'spam',
                    'foo'           => 'bar',
                    'stan'          => 'bran',
                };
$out = hash_rep($in);
is_deeply($expected, $out, $test);


#7
$test = 'valid dictionary with $ signs inserted keys';
$in  =          {
                    'eg$gs'         => 'spam',
                    'fo$$o'         => 'bar',
                    's$n'           => 'bran',
                };
$expected =     {
                    'eg$gs'         => 'spam',
                    'fo$$o'         => 'bar',
                    's$n'           => 'bran',
                };
$out = hash_rep($in);
is_deeply($expected, $out, $test);


#8
$test = 'valid dictionary with one $ sign keys';
$in  =          {
                    '$ggs'          => 'spam',
                    'fo$'           => 'bar',
                    '$'             => 'bran',
                };
$expected =     {
                    '$ggs'          => 'spam',
                    'fo$'           => 'bar',
                    '$'             => 'bran',
                };
$out = hash_rep($in);
is_deeply($expected, $out, $test);



#9
$test = 'valid dictionary with only $ sign keys';
$in  =          {
                    '$'             => 'foo',
                    '$$'            => 'bar',
                    '$$$'           => 'spam',
                    '$$$$'          => 'eggs',
                };
$expected =     {
                    '$'             => 'foo',
                    'bar'           => 'bar',
                    'spam'          => 'spam',
                    'eggs'          => 'eggs',
                };
$out = hash_rep($in);
is_deeply($expected, $out, $test);


#10
$test = 'string with prefix/suffix $ signs';
$in  =  '$this is a string$';
$expected =     {};
$out = hash_rep($in);
is_deeply($expected, $out, $test);









