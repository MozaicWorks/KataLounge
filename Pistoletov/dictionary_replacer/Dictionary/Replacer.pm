package Dictionary::Replacer;

use strict;
use warnings;
our $VERSION = '1.00';

use base 'Exporter';
use Data::Dumper;

our @EXPORT = qw(hash_rep);

#sub hash_rep {
    #my $hashin  = shift;
    #my $hashout = {};
    #eval {
        #foreach my $key ( keys %{$hashin} ) {
            ## done it with if for starters
            #if ( $key =~ /^\$.*\$$/ ) {
                #$hashout->{$hashin->{$key}} = $hashin->{$key};
            #} else {
                #$hashout->{$key} = $hashin->{$key};
            #}
        #}
    #};
    #return $hashout;
#}


# $string =~ s/regex/replacement/g;

sub hash_rep {
    my $hashin  = shift;
    my $hashout = {};
    eval {
        foreach my $key ( keys %{$hashin} ) {
            my $newkey = $key;
            $newkey =~ s/^\$.*\$$/$hashin->{$key}/g;
            $hashout->{$newkey} = $hashin->{$key};
        }
    };
    return $hashout;
}

1;
