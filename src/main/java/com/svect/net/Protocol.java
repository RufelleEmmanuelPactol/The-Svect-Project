package com.svect.net;

/*
    The Svect Wire Connection Stream is a protocol that is used to communicate between the Svect Server and the Svect Client.
    It uses a binary format to send and receive data.


    There are two common protocols that are used in the Svect Wire Connection Stream:
    1. The Standard DirectClient Protocol
        This protocol is used to decode and encode data for the Svect DirectClient driver.
        Unlike the SVECT Querying Language Protocol, this protocol does need to interact with
        the Svect Querying Language. While less powerful, it is more efficient and faster, especially
        for simple operations such as insertion, deletion, and querying.

    2. The SVECT Querying Language Protocol
        This protocol is used to decode and encode data for the Svect Querying Language.
        It is more powerful than the Standard DirectClient Protocol, but it is also slower and less efficient.
        It is used for more complex operations such as data analysis.


    The Protocol for the Svect Wire Connection Stream follows the following format:

    HEADER {
        Length Header -> 4 bytes
        Protocol Header -> 1 byte
        Command Header -> 4 bytes
    } BODY {
         Specified by the protocol
    }

    PROTOCOLS:
    0x00 -> Standard DirectClient Protocol
    0x01 -> SVECT Querying Language Protocol

    COMMANDS (Standard DirectClient Protocol):

    CRUD
    0x100 -> Authentication
    0x101 -> Insertion Request
    0x102 -> Query Request
    0x103 -> Update Request
    0x104 -> Deletion Request
    0x105 -> Range Query Request
    0x106 -> Insertion With Transformation Request
    0x107 -> New Transformer Request

    META
    0x500 -> Create New User
    0x501 -> Update User
    0x502 -> Create New Vector Space
    0x503 -> Create New Vector Space
    0x504 -> Update Vector Space
    0x505 -> Delete Vector Space
    0x506 -> Delete User

    OK RESPONSES
    0x200 -> Authentication OK Response
    0x201 -> OK With Data Response
    0x202 -> OK Without Data Response

    ERROR RESPONSES
    0x300 -> Authentication Error Response
    0x301 -> Query Error Response With Data


    AUTHENTICATION:
    {
      "encryption-type" : <>
      "username" : <>
      "password" : <>
    }

    Planned Supported Encryption Type:
    - "pln-txt" (plain text authentication)

    (0x106) INSERTION WITH TRANSFORMATION:
    {
         "space": <>,
         "transformer": <>
         "vectors": [
             {
                 "vector":[]
                 "schema-arguments":
                    {
                    "arg1" : <>
                    }
             }
         ]
    }







 */