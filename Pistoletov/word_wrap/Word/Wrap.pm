package Word::Wrap;

use strict;
use warnings;
our $VERSION = '1.00';

use base 'Exporter';
use Data::Dumper;

our @EXPORT = qw(word_wrap);

sub word_wrap {
    my $text  = shift;
    my $col   = shift;
    my $ret   = "".$text; # return string no matter what
    return $ret;
}

1;
