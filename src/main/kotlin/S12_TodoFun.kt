package org.example

/**
 * Всегда возбуждает [NotImplementedError], сигнализируя, что операция не
 * реализована.
 */
public inline fun TODO(): Nothing = throw NotImplementedError()