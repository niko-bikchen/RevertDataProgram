/*
File name: data_reverser.cpp
============================
This .cpp file implements functions defined in program_DataHandler.h

Developed by: Nikolay Bikchentaev
Since: 3.03.2019
Version: 1.0
*/
#include "stdafx.h"
#include <string>
#include <algorithm>
#include "program_DataHandler.h"

std::string data = "";

JNIEXPORT jint JNICALL Java_program_DataHandler_write(JNIEnv* env, jclass myclass, jstring str) {
	const char* input_str = env->GetStringUTFChars(str, NULL);
	data = input_str;

	return 1;
}

JNIEXPORT jstring JNICALL Java_program_DataHandler_read(JNIEnv* env, jclass myclass) {
	std::string copy(data);
	std::reverse(copy.begin(), copy.end());

	return env->NewStringUTF(copy.c_str());
}