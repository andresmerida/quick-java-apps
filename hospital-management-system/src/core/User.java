package core;

sealed interface User permits Patient, Staff {}
