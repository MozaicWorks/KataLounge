#!/usr/bin/env perl

use strict;
use warnings;

use Test::More tests => 1;


my $program = '../minesweeper.pl';

pass("file is executable")  unless     -x $program;

