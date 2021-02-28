package com.example.androiddevchallenge.utils

import com.example.androiddevchallenge.R

fun getPuppyList() = listOf(
    Puppy(
        "Tic",
        "10 months",
        "Golden Retriver",
        R.drawable.tic
    ),
    Puppy(
        "Rocky",
        "3 years",
        "American Bulldog",
        R.drawable.rocky
    ),
    Puppy(
        "Piku",
        "4 months",
        "German Sherperd",
        R.drawable.piku
    ),
    Puppy(
        "Rottie",
        "1 year",
        "Rottweiler",
        R.drawable.rottie
    ),
    Puppy(
        "Santy",
        "6 months",
        "Saint Bernard",
        R.drawable.santy
    ),
    Puppy(
        "Rufus",
        "3 years",
        "Doberman",
        R.drawable.rufus
    ),
    Puppy(
        "Rusty",
        "5 years",
        "Great Dane",
        R.drawable.rusty
    ),
    Puppy(
        "Rick",
        "2 years",
        "Shitzu",
        R.drawable.rick
    ),
    Puppy(
        "Soni",
        "9 months",
        "Labrador",
        R.drawable.soni
    ),
    Puppy(
        "Thomas",
        "7 years",
        "Labrador",
        R.drawable.thomas
    )
)

fun getPuppyByIndex(index: Int) = getPuppyList()[index]

fun getDescription() =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ornare velit non mauris elementum, at luctus libero pulvinar. Mauris ac sapien lacus. Nam posuere consectetur mattis. Donec imperdiet, sem lacinia congue ultrices, ligula turpis sodales urna, eget feugiat tortor lacus et est. Phasellus sit amet ultricies odio. Maecenas finibus lorem sit amet orci euismod tempus. Maecenas ornare augue vel sem fermentum vestibulum. Quisque efficitur velit non erat commodo dapibus. Pellentesque ac leo id est volutpat posuere eget non urna. Nulla diam mauris, consectetur et lorem ac, malesuada euismod elit. Curabitur a velit efficitur elit imperdiet accumsan. Duis id justo eu nulla varius tempor. Aliquam id elit dapibus, varius magna a, blandit tellus. Mauris bibendum efficitur mi, et vehicula neque tincidunt sed.\n" +
        "\n" +
        "Aliquam quis facilisis erat. Quisque convallis nunc mattis euismod semper. Nulla ac nunc id felis fringilla volutpat ac ut nisl. Fusce tristique tellus ac finibus accumsan. Praesent pretium faucibus arcu, nec tincidunt metus cursus at. Praesent sem quam, aliquam et tellus scelerisque, sodales sollicitudin ligula. Aenean vel purus interdum, porta odio id, viverra justo. Aliquam auctor gravida lacus sit amet imperdiet. Sed tempor, odio quis varius pretium, magna odio cursus metus, non lacinia nulla turpis in augue.\n" +
        "\nAenean maximus tincidunt tortor, in aliquam augue. Nam ultricies elit eu gravida vehicula. In a imperdiet erat. Cras sit amet tristique erat, ac congue libero. Sed auctor molestie ipsum, vitae euismod nibh vulputate sed. Sed auctor pulvinar dolor. Sed eget gravida magna, eget lacinia sapien. Nunc egestas suscipit auctor.\n" +
        "\n" +
        "In vitae consectetur urna, sed tincidunt ante. Nunc suscipit molestie nisl, ac interdum turpis pretium at. Mauris vitae diam nec nulla hendrerit condimentum. Etiam imperdiet magna sed purus convallis, sed vestibulum libero aliquet. Curabitur egestas ex lectus, sit amet pellentesque nisi tempus vitae. Donec condimentum nunc lorem, sed iaculis ipsum pharetra at. Pellentesque dictum sit amet arcu ut egestas. Proin sed laoreet ex. Quisque a turpis mauris. Quisque lacinia ipsum nec pharetra iaculis.\n" +
        "\n" +
        "Suspendisse eget nibh leo. Nunc velit libero, pellentesque eget diam vel, scelerisque congue urna. Phasellus id quam lacinia, ultrices lacus ac, imperdiet orci. In ut tortor turpis. Nullam et turpis vel enim vestibulum vulputate. Sed fermentum vitae turpis in tempor. Duis molestie varius nunc, sit amet aliquam nunc porta vel. Maecenas tempus dapibus ultrices. Maecenas viverra erat at ultricies molestie. Fusce vitae lacus malesuada sem luctus dictum. Suspendisse potenti."